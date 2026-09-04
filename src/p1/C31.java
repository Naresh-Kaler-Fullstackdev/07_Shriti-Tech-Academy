package p1;

import java.util.List;

public class C31 {
	public static void main(String[] args) {
		int sum = List.of(10, 20, 30).stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
