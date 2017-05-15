package InterviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMergeRemoveCommon {
	
	public static void main(String args []){
		
		List <Integer> l1= new ArrayList<>();		
		l1.add(22);
		l1.add(2);
		l1.add(1);
		l1.add(23);
		l1.add(22);
		l1.add(15);
		l1.add(98);
			
		List <Integer> backupL1= new ArrayList <>(l1);
		
		List <Integer> l2= new ArrayList<>();		
		l2.add(2);
		l2.add(16);
		l2.add(1);
		l2.add(23);
		l2.add(37);
		l2.add(80);		
		
		l1.removeAll(l2);		
		l2.removeAll(backupL1);
		
		System.out.println(l1);
		System.out.println(l2);
/*		
		List <Integer> finalList = new ArrayList<>(l1);
		finalList.addAll(l2);
		System.out.println("Final List  :" + finalList);
		*/		
		l2.addAll(l1);
		Collections.sort(l2);
		System.out.println("List after removing common elements ::" +l2);
				
	}

}
