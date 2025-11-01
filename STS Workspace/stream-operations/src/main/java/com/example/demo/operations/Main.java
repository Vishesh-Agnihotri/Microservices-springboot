package com.example.demo.operations;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo.Person;

public class Main {
	public static void main(String[] args) {
		List<Person> people = List.of(new Person("Alice", "Smith", 30, "Female", "alice@example.com", "New York"),
				new Person("Bob", "Johnson", 45, "Male", "bob@example.com", "Chicago"),
				new Person("Charlie", "Williams", 25, "Male", "charlie@example.com", "Los Angeles"),
				new Person("Diana", "Brown", 35, "Female", "diana@example.com", "Miami"),
				new Person("Ethan", "Davis", 30, "Male", "ethan@example.com", "New York"),
				new Person("Fiona", "Clark", 29, "Female", "fiona@example.com", "Chicago"),
				new Person("Alice", "Smith", 30, "Female", "alice@example.com", "New York"), // duplicate
				new Person("George", "Miller", 45, "Male", "george@example.com", "San Francisco"),
				new Person("Hannah", "Taylor", 35, "Female", "hannah@example.com", "Miami"),
				new Person("Ivan", "Anderson", 50, "Male", "ivan@example.com", "Los Angeles"),
				new Person("Judy", "Thomas", 25, "Female", "judy@example.com", "Chicago"),
				new Person("Charlie", "Williams", 25, "Male", "charlie@example.com", "Los Angeles"), // duplicate
				new Person("Kevin", "Jackson", 41, "Male", "kevin@example.com", "New York"),
				new Person("Lily", "White", 33, "Female", "lily@example.com", "Boston"),
				new Person("Mike", "Harris", 29, "Male", "mike@example.com", "Seattle"),
				new Person("Nina", "Martin", 37, "Female", "nina@example.com", "Chicago"),
				new Person("Oscar", "Thompson", 28, "Male", "oscar@example.com", "Miami"),
				new Person("Fiona", "Clark", 29, "Female", "fiona@example.com", "Chicago") // duplicate
		);

		// Mapping people with similiar cities
		Map<String, List<String>> peopleWithCity = people.stream().collect(
				Collectors.groupingBy(Person::getCity, Collectors.mapping(Person::getFirstName, Collectors.toList())));
		System.out.println(peopleWithCity);
		System.out.println();
		
		// Mapping String with its length
		Map<String, List<Integer>> stringLengthInList = people.stream()
				.collect(Collectors.groupingBy(Person::getFirstName,
						Collectors.mapping(person -> person.getFirstName().length(), Collectors.toList())));
		System.out.println(stringLengthInList);
		System.out.println();

		Map<String, Integer> stringLength = people.stream().distinct()
				.collect(Collectors.toMap(Person::getFirstName, person -> person.getFirstName().length()));
		System.out.println(stringLength);
		System.out.println();

		Map<String, Long> wordCount = people.stream().collect(Collectors.groupingBy(Person::getFirstName,Collectors.counting()));
		System.out.println(wordCount);
		System.out.println();

		//Mapping fnames with similiar lnames
		Map<String,List<String>> lnameList = people.stream().collect(Collectors.groupingBy(Person::getLastName,Collectors.mapping(Person::getFirstName, Collectors.toList())));
		System.out.println(lnameList);
		System.out.println();

		
		//Using comparator
		List<Person> sortWithAge = people.stream().sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getCity)).collect(Collectors.toList());
		System.out.println(sortWithAge);
		System.out.println();

		//Sort person based on age
		List<Person> sortAge = people.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
		System.out.println(sortAge);
		System.out.println();

		//reverseorder
		List<Person> sortAge1 = people.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).collect(Collectors.toList());
		System.out.println(sortAge1);
		System.out.println();

		
		//Grouping peoplebygender
		Map<String,List<Person>> peopleGender = people.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.toList()));
		System.out.println(peopleGender);
		System.out.println();

		//Mapping fnames with cities
		Map<String, List<String>> fnameCity = people.stream().collect(Collectors.groupingBy(Person::getFirstName,Collectors.mapping(Person::getCity, Collectors.toList())));
		System.out.println(fnameCity);
		System.out.println();

		
	}
}