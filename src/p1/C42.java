package p1;

import java.util.stream.IntStream;

public class C42 {
	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 100).sum();
		System.out.println(sum);
	}
}
