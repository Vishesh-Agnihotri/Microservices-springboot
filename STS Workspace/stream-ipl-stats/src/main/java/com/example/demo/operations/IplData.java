package com.example.demo.operations;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.SequencedSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.model.IPLPlayer;

public class IplData {
	public static void main(String[] args) {

		List<IPLPlayer> players = List.of(
			    new IPLPlayer("Virat Kohli", "RCB", "Batsman", 35, 237, 7263, 0, 130.0, 0.0),
			    new IPLPlayer("MS Dhoni", "CSK", "Wicket-Keeper", 43, 250, 5082, 0, 135.0, 0.0),
			    new IPLPlayer("Jasprit Bumrah", "MI", "Bowler", 31, 120, 56, 145, 60.0, 6.5),
			    new IPLPlayer("Hardik Pandya", "MI", "All-Rounder", 31, 123, 2300, 50, 140.0, 8.2),
			    new IPLPlayer("Rashid Khan", "GT", "Bowler", 26, 100, 300, 130, 120.0, 6.3),
			    new IPLPlayer("Shubman Gill", "GT", "Batsman", 25, 80, 2200, 0, 145.0, 0.0),
			    new IPLPlayer("Sanju Samson", "RR", "Wicket-Keeper", 30, 140, 3600, 0, 135.0, 0.0),
			    new IPLPlayer("Ruturaj Gaikwad", "CSK", "Batsman", 27, 60, 1800, 0, 140.0, 0.0),
			    new IPLPlayer("Mohammed Siraj", "RCB", "Bowler", 30, 95, 100, 110, 50.0, 7.0),
			    new IPLPlayer("David Warner", "DC", "Batsman", 38, 170, 6100, 0, 138.0, 0.0),
			    new IPLPlayer("Andre Russell", "KKR", "All-Rounder", 36, 110, 2100, 90, 170.0, 9.0),
			    new IPLPlayer("Yuzvendra Chahal", "RR", "Bowler", 33, 140, 50, 180, 45.0, 7.2),
			    new IPLPlayer("KL Rahul", "LSG", "Batsman", 32, 120, 4200, 0, 137.0, 0.0),
			    new IPLPlayer("Faf du Plessis", "RCB", "Batsman", 40, 130, 4200, 0, 134.0, 0.0),
			    new IPLPlayer("Ravindra Jadeja", "CSK", "All-Rounder", 36, 200, 2700, 135, 128.0, 7.1),
			    
			    // Duplicates
			    new IPLPlayer("Virat Kohli", "RCB", "Batsman", 35, 237, 7263, 0, 130.0, 0.0),
			    new IPLPlayer("MS Dhoni", "CSK", "Wicket-Keeper", 43, 250, 5082, 0, 135.0, 0.0),
			    new IPLPlayer("Jasprit Bumrah", "MI", "Bowler", 31, 120, 56, 145, 60.0, 6.5),
			    new IPLPlayer("Hardik Pandya", "MI", "All-Rounder", 31, 123, 2300, 50, 140.0, 8.2),
			    new IPLPlayer("Rashid Khan", "GT", "Bowler", 26, 100, 300, 130, 120.0, 6.3)
			);

			Map<String, Set<String>> playersWithTeam = players.stream().collect(Collectors
					.groupingBy(IPLPlayer::getTeam, Collectors.mapping(IPLPlayer::getName, Collectors.toSet())));
			System.out.println(playersWithTeam);
			playersWithTeam.forEach((k, v) -> {
				System.out.println("Team: " + k);
				System.out.print("Players: " + v);
				System.out.println();
			});

			Map<String, List<IPLPlayer>> teamToPlayersMap = players.stream()
					.collect(Collectors.groupingBy(IPLPlayer::getTeam));
			teamToPlayersMap.forEach((team, teamPlayers) -> {
				System.out.println("Team: " + team);
				teamPlayers.forEach(player -> System.out.println("  - " + player.getName()));
			});

			Map<String, Long> playersCount = players.stream()
					.collect(Collectors.groupingBy(IPLPlayer::getTeam, Collectors.mapping(IPLPlayer::getName, // extract
																												// player
																												// name
							Collectors.collectingAndThen(Collectors.toSet(), // remove duplicates by name
									set -> (long) set.size() // count unique names
							))));
			System.out.println(playersCount);
			
			Optional<IPLPlayer> playerMaxAge = players.stream().max(Comparator.comparingDouble(IPLPlayer::getAge));
			System.out.println(playerMaxAge);
			
			playerMaxAge.ifPresent(player ->
		    System.out.println("Oldest Player: " + player.getName() + " (" + player.getAge() + " years)")
		);
			
			Optional<IPLPlayer> playerMostScores = players.stream().max(Comparator.comparingDouble(IPLPlayer::getRunsScored));
			playerMostScores.ifPresent(v->System.out.println("Most runs scored by: "+v.getName()));
			
			List<String> sortBasedOnMatches = players.stream().sorted((Comparator.comparingDouble(IPLPlayer::getMatchesPlayed).reversed())).map(IPLPlayer::getName).distinct().collect(Collectors.toList());
			System.out.println(sortBasedOnMatches);
			SequencedSet<String> sortedUniqueNamesBasedOnAge = players.stream()
				    .sorted(Comparator.comparingInt(IPLPlayer::getMatchesPlayed).reversed())
				    .map(IPLPlayer::getName)
				    .collect(Collectors.toCollection(LinkedHashSet::new)); 
			System.out.println(sortedUniqueNamesBasedOnAge);
			
			SequencedSet<String> topFiveScorers = players.stream().sorted((Comparator.comparingDouble(IPLPlayer::getRunsScored).reversed())).map(IPLPlayer::getName).collect(Collectors.toCollection(LinkedHashSet::new));
			System.out.println(topFiveScorers);
			
//			List<String> topFiveScorers1 = players.stream().sorted((Comparator.comparingDouble(IPLPlayer::getRunsScored).reversed())).map(IPLPlayer::getName).collect(Collectors.toList());
//			System.out.println(topFiveScorers1);
			
			SequencedSet<String> topFiveScorersSkip5 = players.stream().sorted((Comparator.comparingDouble(IPLPlayer::getRunsScored).reversed())).map(IPLPlayer::getName).distinct().skip(5).limit(3).collect(Collectors.toCollection(LinkedHashSet::new));
			System.out.println(topFiveScorersSkip5);
	}
	}
