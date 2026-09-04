package p1;

import java.util.List;

public class C33 {
	public static void main(String[] args) {
		double average = List.of(10, 20, 30).stream()
				.mapToInt(Integer::intValue)
				.average()
				.getAsDouble();
		System.out.println(average);
	}
}
