package p1;

import java.util.List;

public class C17 {
	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Jo", 01, "IT",100000, "Chennai"),
				new Employee("Ankit", 02, "IT", 80000, "Pune"),
				new Employee("Raja", 03, "HR", 100000, "Chennai"),
				new Employee("Rakesh", 04, "HR", 100000, "Pune"),
				new Employee("Rohan", 05, "HR", 100000, "Pune"),
				new Employee("Swetha", 06, "Finance", 140000, "Chennai"),
				new Employee("Vasu", 07, "Finance", 120000, "Bengaluru"),
				new Employee("Mani", 8, "Finance", 300000, "Ooty")
				);
		
		List<Employee> firstFiveEmployees = employees.stream().limit(5).toList();
		firstFiveEmployees.forEach(entry -> System.out.println(entry.name()));
		
		employees.stream().limit(5).forEach(System.out::println);
	}
}
