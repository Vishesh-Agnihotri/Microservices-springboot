package com.example.demo.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.model.Employee;

public class EmployeeDataGenerator {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "Alice", "alice@example.com", "1234567890", "IT", "Developer", 80000,
				"2022-01-15", true, "Bob"));
		employees.add(new Employee(2, "Bob", "bob@example.com", "1234567891", "IT", "Lead", 100000, "2021-09-01", true,
				"Clara"));
		employees.add(new Employee(3, "Charlie", "charlie@example.com", "1234567892", "HR", "Executive", 60000,
				"2023-03-10", true, "Diana"));
		employees.add(new Employee(4, "David", "david@example.com", "1234567893", "Sales", "Manager", 95000,
				"2020-11-20", true, "Bob"));
		employees.add(new Employee(5, "Eve", "eve@example.com", "1234567894", "IT", "Developer", 75000, "2022-07-12",
				true, "Bob"));
		employees.add(new Employee(6, "Frank", "frank@example.com", "1234567895", "HR", "Executive", 60000,
				"2023-01-05", false, "Diana"));
		employees.add(new Employee(7, "Grace", "grace@example.com", "1234567896", "Finance", "Accountant", 70000,
				"2021-05-21", true, "Clara"));
		employees.add(new Employee(8, "Hank", "hank@example.com", "1234567897", "IT", "Developer", 80000, "2022-01-15",
				true, "Bob"));
		employees.add(new Employee(9, "Ivy", "ivy@example.com", "1234567898", "IT", "QA", 72000, "2022-04-20", false,
				"Clara"));
		employees.add(new Employee(10, "Jack", "jack@example.com", "1234567899", "Sales", "Executive", 65000,
				"2020-08-30", true, "David"));

		// Duplicates and variations
		employees.add(new Employee(11, "Alice", "alice2@example.com", "1234567800", "IT", "Developer", 80000,
				"2022-01-15", true, "Bob"));
		employees.add(new Employee(12, "Kevin", "kevin@example.com", "1234567801", "Finance", "Accountant", 70000,
				"2021-05-21", true, "Clara"));
		employees.add(new Employee(13, "Laura", "laura@example.com", "1234567802", "HR", "Manager", 88000, "2020-03-11",
				true, "Diana"));
		employees.add(new Employee(14, "Mike", "mike@example.com", "1234567803", "IT", "Developer", 80000, "2023-06-01",
				false, "Bob"));
		employees.add(new Employee(15, "Nina", "nina@example.com", "1234567804", "Sales", "Executive", 65000,
				"2021-12-10", true, "David"));
		employees.add(new Employee(16, "Oscar", "oscar@example.com", "1234567805", "IT", "QA", 72000, "2022-04-20",
				true, "Clara"));
		employees.add(new Employee(17, "Paul", "paul@example.com", "1234567806", "HR", "Executive", 60000, "2023-03-10",
				true, "Diana"));
		employees.add(new Employee(18, "Quinn", "quinn@example.com", "1234567807", "Finance", "Accountant", 70000,
				"2021-05-21", false, "Clara"));
		employees.add(new Employee(19, "Rachel", "rachel@example.com", "1234567808", "Sales", "Manager", 95000,
				"2020-11-20", true, "Bob"));
		employees.add(new Employee(20, "Steve", "steve@example.com", "1234567809", "IT", "Developer", 80000,
				"2022-01-15", true, "Bob"));

		Map<Integer, Double> idAndSal = employees.stream()
				.collect(Collectors.toMap(Employee::getId, Employee::getSalary));
		System.out.println(idAndSal);
		
		Map<Integer, String> idAndName = employees.stream()
				.collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println(idAndName);

		Map<String, Long> nameOccurence = employees.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		nameOccurence.forEach((k, v) -> {
			System.out.println("Name : " + k);
			System.out.println("Occurences: " + v);
		});

		Map<String, Object> nameLength = employees.stream()
				.collect(Collectors.toMap(
		                Employee::getName,
		                emp -> emp.getName().length(),
		                (existing, replacement) -> existing // handles duplicate names gracefully
		            ));
		nameLength.forEach((k, v) -> {
			System.out.println("Name : " + k);
			System.out.println("Length: " + v);
		});
		
		Map<String,List<String>> empWithDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(empWithDept);
		
		Map<String,List<String>> sameManager = employees.stream().collect(Collectors.groupingBy(Employee::getReportingManager,Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(sameManager);
		
		List<String> uniqueNames = employees.stream().distinct().collect(Collectors.mapping(Employee::getName,Collectors.toList()));
		System.out.println(uniqueNames);
	}
}
