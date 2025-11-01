package com.practice.post.data;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.post.model.Post;

public class PostFetcher {

    public static List<Post> fetchUserIdAndIdData(String apiUrl) throws IOException {
        String json = fetchData(apiUrl);
        return mapJsonToUserIdAndId(json);
    }

    private static List<Post> mapJsonToUserIdAndId(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode postsNode = objectMapper.readTree(json);

        List<Post> postList = new ArrayList<>();
        for (JsonNode postNode : postsNode) {
            Post post = new Post();

            postNode.fields().forEachRemaining(entry -> {
                String fieldName = entry.getKey();
                String fieldValue = entry.getValue().asText();

                // Use reflection to set the field dynamically
                try {
                    Field field = Post.class.getDeclaredField(fieldName);
                    field.setAccessible(true);

                    if (field.getType() == int.class) {
                        field.setInt(post, Integer.parseInt(fieldValue));
                    } else {
                        field.set(post, fieldValue);
                    }
                } catch (NoSuchFieldException | IllegalAccessException | NumberFormatException e) {
                    e.printStackTrace();
                }
            });

            postList.add(post);
        }

        return postList;
    }

    private static String fetchData(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        StringBuilder jsonStringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(connection.getInputStream())) {
            while (scanner.hasNextLine()) {
                jsonStringBuilder.append(scanner.nextLine());
            }
        } finally {
            connection.disconnect();
        }

        return jsonStringBuilder.toString();
    }
}
