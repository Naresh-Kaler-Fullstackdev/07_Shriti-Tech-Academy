package p1;

import java.util.List;

public class C24 {
	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Jo", 01, "IT",100000, "Chennai"),
				new Employee("Ankit", 02, "IT", 80000, "Pune"),
				new Employee("Raja", 03, "HR", 100000, "Chennai"),
				new Employee("Rakesh", 04, "HR", 100000, "Pune"),
				new Employee("Rohan", 05, "HR", 100000, "Pune"),
				new Employee("Swetha", 06, "Finance", 140000, "Chennai"),
				new Employee("Vasu", 07, "Finance", 120000, "Bengaluru"),
				new Employee("Mani", 8, "Finance", 300000, "Ooty"),
				new Employee("Ashish", 9, "IT", 250000, "Delhi"),
				new Employee("Basant", 10, "IT", 350000, "Bhubhaneshwar")
				);
		
		boolean checkCity = employees.stream().allMatch(emp->emp.city()=="Chennai");
		System.out.println(checkCity);
	}
}
