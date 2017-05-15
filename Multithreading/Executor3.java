package ThreadLearn;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor3 {
	public static void main(String ar []) throws InterruptedException, ExecutionException{
		ExecutorService executorService = Executors.newCachedThreadPool(); 
		@SuppressWarnings("unchecked")
		Future future = executorService.submit(new Callable(){
			@Override
			public Object call() throws Exception {
				System.out.println("Async Callable");
				return "Callable Result";
			}
		});
		System.out.println("future.get() = " + future.get());
	}
}
