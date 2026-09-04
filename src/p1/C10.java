package p1;

import java.util.List;

public class C10 {
	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Ashish", 01, "IT", 400000, "Delhi"),
				new Employee("Nagamani", 02, "Finance", 150000, "Hyderabad"),
				new Employee("Malavika", 03, "HR", 100000, "Bangalore"),
				new Employee("Hasant", 04, "IT", 500000, "Bhubaneshwar"),
				new Employee("Chakri", 05, "Finance", 450000, "Hyderabad"),
				new Employee("Suchita", 06, "HR", 125000, "Bengaluru")
				);
		employees.stream()
			.filter(employee -> employee.salary()>150000)
			.forEach(System.out::println);
			//.forEach(emp -> System.out.println(emp.name() + " -> " + emp.Salary()));
	}
}
