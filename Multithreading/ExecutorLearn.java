package ThreadLearn;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorLearn {
	
	public static void main(String aa[]) throws InterruptedException, ExecutionException{
		
		ExecutorService executor1= Executors.newCachedThreadPool();
		Runnable r1= new Executor2("Thread a");
		//executor1.execute(r1);
		
		Future future = executor1.submit(r1);
		
		/*ExecutorService executor2= Executors.newCachedThreadPool();
		Runnable r2= new Executor2("Thread b");
		executor2.execute(r2);*/
		
		System.out.println("future :: "+future.get());
		
		while
			(!executor1.isTerminated()){
				
			}
			
	}

}
