package InterviewPrep;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class FIFOImplementation {
	
	public static void main(String atrg[]){
		Queue<Integer> mq= new LinkedList<Integer>();
		//Other Collection that can be used
		//Queue<Integer> mq= new LinkedBlockingQueue();		
	
		mq.add(1);
		mq.add(8);
		mq.add(4);
		mq.add(7);
		System.out.println(mq);
		int first = mq.poll();  //retrieve and remove the first element
		
		System.out.println(first);
		mq.poll();
		mq.poll();
				
		System.out.println(mq);
		
	}

}
