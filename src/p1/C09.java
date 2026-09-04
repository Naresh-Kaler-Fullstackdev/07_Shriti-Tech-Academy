package p1;

import java.util.List;

public class C09 {
	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Ashish", 01, "IT", 400000, "Delhi"),
				new Employee("Nagamani", 02, "Finance", 150000, "Hyderabad"),
				new Employee("Malavika", 03, "HR", 100000, "Bangalore")
				);
		employees.stream()
		.map(Employee::name)
		.forEach(System.out::println);
	}
}
