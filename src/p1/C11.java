package p1;

import java.util.Arrays;
import java.util.List;

public class C11 {
	public static void main(String[] args) {
		Vertical adm = new Vertical("Admin",
				Arrays.asList(new Employee("Jo", 01, "IT",100000, "Chennai"),
						(new Employee("Ankit", 02, "IT", 80000, "Pune"))
				));
		
		Vertical mktg = new Vertical ("Marketing",
				Arrays.asList(new Employee("Raja", 03, "HR", 100000, "Chennai"),
						new Employee("Rakesh", 04, "HR", 100000, "Pune"),
						new Employee("Rohan", 05, "HR", 100000, "Pune"))
				);
		
		Vertical sls = new Vertical ("Sales",
				Arrays.asList(new Employee("Swetha", 06, "Finance", 140000, "Chennai"),
						new Employee("Vasu", 07, "Finance", 120000, "Bengaluru"),
						new Employee("Mani", 8, "Finance", 300000, "Ooty"))
				);
		
		List<Vertical> vtls = Arrays.asList(adm, mktg, sls);
		List<String> empNames = vtls.stream()
				.flatMap(vtl -> vtl.empList().stream())
				.map(Employee::name).toList();
		
		System.out.println(empNames);
	}
}
