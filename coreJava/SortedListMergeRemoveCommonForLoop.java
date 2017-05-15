package InterviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedListMergeRemoveCommonForLoop {
	
	public static void main(String args []){
		
		int [] a1= {1,3,8,34,65,71};
		int [] a2= {1,11,34,71,90};
		
//TreeSet to sort it, otherwise use list as below		
		//Set<Integer> set1= new TreeSet<Integer>();
		//Set<Integer> set2= new TreeSet<Integer>();
		
		List set1 = new ArrayList();
		List set2 = new ArrayList();
		
		for (int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++){
				if(a1[i] == a2[j])
				set1.add(a1[i]);
			}	
			if(! set1.contains(a1[i]))
				set2.add(a1[i]);
		}
		System.out.println(set1);
		System.out.println(set2);
		
		for(int i=0;i<a2.length;i++){
			if(! set1.contains(a2[i]))
				set2.add(a2[i]);
			}
		System.out.println(set2);
		
//Further Convert set to int [] - Method 1		
		/*Integer[] arr = set2.toArray(new Integer[set2.size()]);
		System.out.println(arr);*/
//Further Convert set to int [] - Method 2
		/*int[] y = new int[set2.size()];
		int c = 0;
		for(int x : set2) y[c++] = x;
		System.out.println(y.toString());*/
	}		
}