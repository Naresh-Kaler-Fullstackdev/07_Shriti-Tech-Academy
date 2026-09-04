package p1;

import java.util.function.Function;

public class C02 {
	public static void main(String[] args) {
		Function<Employee,String> fun = employee -> employee.name();
		String name = fun.apply(new Employee ("Jo", 01, "IT", 10000, "Chennai"));
		System.out.println(name);
	}
}
