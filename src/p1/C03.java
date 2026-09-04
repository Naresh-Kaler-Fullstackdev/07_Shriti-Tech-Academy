package p1;

import java.util.List;

public class C03 {
	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Ashish", 01, "IT", 400000, "Delhi"),
				new Employee("Nagamani", 02, "Finance", 150000, "Hyderabad"),
				new Employee("Malavika", 03, "HR", 100000, "Bangalore")
				);
		employees.stream()
				.forEach(emp->System.out.println(emp.name() + " " + emp.salary()));
	}
}
