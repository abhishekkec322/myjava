package ThreadLearn;

public class HelloThreadClass extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        //(new HelloThreadClass()).start();
    	
    	HelloThreadClass t1= new HelloThreadClass();
    	t1.start();
    	//t1.run();
    	
    }
}