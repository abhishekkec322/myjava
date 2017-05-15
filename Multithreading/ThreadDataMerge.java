package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

	public class ThreadDataMerge {
		
	    public static void main(String[] args) {
	    	
	    	 int [] a= {1,2,3};
		        for (int n: a){
		        	
		        	System.out.println(a[n-1]);
		        	 continue;
		        }
	        ExecutorService executorWrite = Executors.newFixedThreadPool(1);
	        ExecutorService executorRead = Executors.newFixedThreadPool(1);
	        	        
	        Runtime rt = Runtime.getRuntime();
	        
	       try{
	        System.out.println(rt.totalMemory());
	       }finally{
	    	   System.out.println("Finally");
	       }
	       
	        Runnable readWorker = new ReadDataFirst("Thread1");
	        executorRead.execute(readWorker);
	      
	        System.out.println(rt.totalMemory());
	        
	        Runnable writeWorker = new ReadDataSecond("Thread2");
	            executorWrite.execute(writeWorker);
	            
	        System.out.println(rt.totalMemory());    
	        
	        while (!executorWrite.isTerminated()) {
	        }
	        while (!executorRead.isTerminated()) {
	        }
	        
	       
	        
	        
	        
	        System.out.println("Finished all threads");
	    
	    }
	}
