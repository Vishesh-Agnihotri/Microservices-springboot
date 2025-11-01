package com.practice.dsa;

import java.util.Scanner;

public class CountingSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the maximum value in the array to determine the range of the count array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create the count array (size of max+1 to cover all values from 0 to max)
        int[] count = new int[max + 1];

        // Count the occurrences of each element in the input array
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Modify the count array by adding the previous counts (cumulative sum)
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Create the output array to store the sorted elements
        int[] output = new int[n];

        // Build the output array by placing elements at their correct positions
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;  // Decrease the count for each element
        }

        // Copy the sorted elements from the output array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

        // Output the sorted array
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
