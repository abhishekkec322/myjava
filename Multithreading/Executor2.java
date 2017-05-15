package ThreadLearn;



public class Executor2 implements Runnable{

	String name="";
	
	public Executor2(String str) {
		this.name=str;
	}


	@Override
	public void run() {
		
		while(!Thread.currentThread().isInterrupted()){
		process();
		}
	}

	
	void process(){
		
		System.out.println("I am running"+ Thread.currentThread().getName());
	
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
