package p1;

import java.util.stream.Stream;

public class C04 {
	public static void main(String[] args) {
		Stream.generate(() -> Math.random())
		.limit(10)
		.forEach(System.out::println);
	}
}
