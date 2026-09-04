package p1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class C46 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> messageFuture = CompletableFuture.supplyAsync(() -> { return "Have a great day";});
		System.out.println(messageFuture.get());
	}
}
