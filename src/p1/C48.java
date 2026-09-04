package p1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class C48 {
	public static void main(String[] args) {
		CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> 10);
		CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> 20);
		
		CompletableFuture<Integer> combined = task1.thenCombine(task2, (result1,result2) -> result1 + result2);
		//CompletableFuture<Integer> combined = task1.thenCombine(task2, (a,b) -> a + b);
		
		try {
			System.out.println(combined.get()); //30
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
