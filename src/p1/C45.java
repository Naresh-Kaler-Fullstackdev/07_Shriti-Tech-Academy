package p1;

import java.util.concurrent.CompletableFuture;

public class C45 {
	public static void main(String[] args) {
		CompletableFuture.runAsync(() -> System.out.println("email sent"));
	}
}
