package p1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class C47 {
	public static void main(String[] args) {
		//allOf
		CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> "Hello! ");
		CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> "Have a great day ");
		CompletableFuture<String> task3 = CompletableFuture.supplyAsync(() -> "!!!");
		
		//It returns a CompletableFuture<Void> - that means it does not contain the results of the tasks
		//It only completes when all the given futures complete
		CompletableFuture<Void> allTasks = CompletableFuture.allOf(task1, task2, task3);
		
		allTasks.thenRun(() -> {
			try {
				System.out.println(task1.get()+ " " + task2.get() + " " + task3.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
