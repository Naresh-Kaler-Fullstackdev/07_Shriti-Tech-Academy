package p1;


import java.util.function.Predicate;

public class C01 {
	public static void main(String[] args) {
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(10));
	}
}
