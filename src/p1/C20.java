package p1;

import java.util.Comparator;
import java.util.List;

public class C20 {
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
		
		List<Employee> sortedEmployees = employees.stream()
				.sorted(Comparator.comparing(Employee::salary))
				//.sorted((emp1,emp2) -> Double.compare(emp1.salary(), emp2.salary()))
				.toList();
		sortedEmployees.stream().forEach(entry -> System.out.println(entry.name() + " -> " + entry.salary()));
		
		employees.stream().sorted(Comparator.comparing(Employee::salary)).forEach(System.out::println);
		
		System.out.println(sortedEmployees);
	}
}
