package p1;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C32 {
	public static void main(String[] args) {
		Stream<Integer> objStream = List.of(10, 20, 30).stream().map(Integer::intValue);
		IntStream primitiveStream = List.of(10, 20, 30).stream().mapToInt(Integer::intValue);

		System.out.println(objStream);
		System.out.println(primitiveStream);

		objStream.forEach(System.out::println);
		primitiveStream.forEach(System.out::println);

		int sumOfNumbers1 = List.of(10, 20, 30).stream()
				.map(Integer::intValue)
				.reduce(0, Integer::sum);
		System.out.println(sumOfNumbers1);
		
		int sumOfNumbers2 = List.of(10, 20, 30).stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(sumOfNumbers2);
	}
}
