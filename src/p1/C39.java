package p1;

import java.util.List;

public class C39 {
	public static void main(String[] args) {
		String course = List.of("Spring","Java").stream()
				.filter(str->str.startsWith("A"))
				.findAny()
				//.findFirst()
				.orElse("Not Available");
		System.out.println(course);
	}
}
