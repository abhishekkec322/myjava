package InterviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMergeRemoveDuplicatesForLoop {
	
	public static void main(String args []){
		List <Integer> l1= new ArrayList<>();		
		l1.add(22); l1.add(2); 		l1.add(1); 		l1.add(23); 		l1.add(22); 		l1.add(15);
		l1.add(98); 		l1.add(2); 
		
		System.out.println("l1    :"+l1);
		
		List <Integer> l2= new ArrayList<>();		
		l2.add(2);		l2.add(16); 		l2.add(1); 		l2.add(23); 		l2.add(22);
		l2.add(7); 		l2.add(37); 		l2.add(80);
		
		System.out.println("l2    :"+l2);
		
		for(Object o1: l1){			
			if(!l2.contains(o1))
				l2.add((Integer) o1);
		}
		
		Collections.sort(l2);
		System.out.println("L2 after mering l1 and remove duplicates"+ l2);
		
	}

}
