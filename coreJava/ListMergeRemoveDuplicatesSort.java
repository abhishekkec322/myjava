package InterviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListMergeRemoveDuplicatesSort {
	
	public static void main(String args[]){
		
		List <Integer> l1= new ArrayList<>();		
		l1.add(22); 	l1.add(2); 		l1.add(1); 		l1.add(23); 		l1.add(22);
		l1.add(15); 		l1.add(2);		l1.add(98);		

		List <Integer> l2= new ArrayList<>();		
		l2.add(2);		l2.add(16);		l2.add(1);		l2.add(23);		l2.add(22);
		l2.add(7);		l2.add(37);		l2.add(80);
	
		//Solution 1 -Using Set
		Set <Integer> set= new TreeSet<>(l1);
		set.addAll(l2);
		System.out.println("Printing Set :"+set);
		List <Integer> newList= new ArrayList<>();
		newList.addAll(set);
		System.out.println("Printing Set converted to a list :"+newList);
		
		// Solution2 - Using List Operations
		l1.removeAll(l2);
		l1.addAll(l2);
		Collections.sort(l1);
		System.out.println("Sorted List without duplicates after merge of 2 list"+l1);
			
		}
}
