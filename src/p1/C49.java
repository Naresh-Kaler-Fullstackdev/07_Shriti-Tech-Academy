package p1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class C49 {
	public static void main(String[] args) {
		CompletableFuture<Integer> result = CompletableFuture.supplyAsync(() -> 100)
				.thenCompose(num -> CompletableFuture.supplyAsync(() -> num * 2));
		try {
			System.out.println(result.get()); //200
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
