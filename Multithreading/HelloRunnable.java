package ThreadLearn;

public class HelloRunnable implements Runnable {

   /* public void run() {
        System.out.println("Hello from a runnable thread!");
    }*/
	
	public void run() {
		for (int x = 1; x <= 4; x++) {
			
/*		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/	
		
//		synchronized(this){
//		synchronized(HelloRunnable.class){
		System.out.println("Run by "
		+ Thread.currentThread().getName()
		+ ", x is " + x);
		}
		
		}
//		}

    public static void main(String args[]) throws InterruptedException {
        //(new Thread(new HelloRunnable())).start();
    	HelloRunnable runnable= new HelloRunnable();
    	Thread t1= new Thread(runnable);
    	Thread t2= new Thread(runnable);
    	
    	t1.setName("Thread 1");
    	t2.setName("Thread 2");
    	
    	t1.start();
    	
    	
    	t1.join();
    	t2.start();
    	//t1.start();
    }

}