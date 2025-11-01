package com.practice.dsa;

public class InsertionSort {
    
    // Function to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse through 1 to n
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // The current element to be inserted in the sorted part
            int j = i - 1;

            // Shift elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j = j - 1;
            }
            arr[j + 1] = key; // Insert the key in its correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        insertionSort(arr);

        System.out.println("\n\nSorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

