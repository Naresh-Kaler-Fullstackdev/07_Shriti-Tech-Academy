package p1;

import java.util.Arrays;

public class C36 {
	public static void main(String[] args) {
		int max = Arrays.stream(new int[] {10, 20, 30}).max().getAsInt();
		System.out.println(max);
	}
}
