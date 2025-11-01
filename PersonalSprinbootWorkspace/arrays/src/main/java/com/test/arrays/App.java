package com.test.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
	public static void main(String[] args) {
		int array[] = { 1, 2, 4, 1, 5, 5, 1, 5, 215, 12, 521, 21, 52, 25, 5 };
		int arrayNew[] = { 1, 2, 4, 1, 5, 5, 1, 5, 215, 12, 521, 21, 52, 25, 5 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		List<Integer> arrayList = new ArrayList<>();
		for (int number : arrayNew) {
			arrayList.add(number);
		}
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println();
		// Sorting using stream
		array = Arrays.stream(array).sorted().toArray();
		System.out.println(Arrays.toString(array));
		System.out.println();

		// implementing sort on collection
		Integer collectionArray[] = { 21, 24, 12, 125, 5, 5, 5, 1, 2, 5, 125, 25, 25, 2, 12, 12, 1321, 2, 12, 12, 5 };
		List<Integer> arraySplit = Arrays.asList(collectionArray);
		System.out.println(arraySplit);
		Collections.sort(arraySplit);
		System.out.println(arraySplit);
		System.out.println();

		int oldArray[] = { 21312, 4, 242, 42, 42, 42, 42, 42, 42, 42, 12, 1, 11, 24, 24, 121, 5 };
		Integer[] integerArray = Arrays.stream(oldArray).boxed().toArray((Integer[]::new));
		List<Integer> newArray = Arrays.asList(integerArray);
		List<Integer> distinctArray = newArray.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctArray);
		List<Integer> sortedArray = newArray.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedArray);
		System.out.println();
		
		int a[] = {1,0,0,1,0,1};
		List<Integer> intArray = IntStream.of(a).boxed().collect(Collectors.toList());
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Collections.sort(intArray);
		System.out.println(intArray);
		System.out.println();
		
		int a1=0,b=1;
		int temp=0;
		System.out.println(a1);
		System.out.println(b);
		for(int i=0;i<=10;i++) {
			temp=a1+b;
			a1=b;
			b=temp;
			System.out.println(temp);

		}
	}
}
