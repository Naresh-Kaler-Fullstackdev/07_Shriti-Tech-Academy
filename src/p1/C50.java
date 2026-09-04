package p1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class C50 {
	public static void main(String[] args) {
		CompletableFuture<Integer> result = CompletableFuture.supplyAsync(() -> 10).thenApply(num -> num * 2);
		try {
			System.out.println(result.get()); //20
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
