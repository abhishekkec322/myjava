package InterviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListMergeRetainOnlyDuplicates {
	
	public static void main(String args []){
		int [] a1= {1,3,8,54,2,65,7};
		int [] a2= {3,7,1,5,8,90};
		
		//TreeSet to sort it, otherwise use list as below		
			Set<Integer> set1= new TreeSet<Integer>();

		
		//List set1 = new ArrayList();
		
		for (int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++){
				if(a1[i] == a2[j])
				set1.add(a1[i]);
			}	
			
		}
		System.out.println(set1);
		
		//Further Convert set to int [] - Method 1		
				Integer[] arr = set1.toArray(new Integer[set1.size()]);
				System.out.println(arr);
		//Further Convert set to int [] - Method 2
				/*int[] y = new int[set1.size()];
				int c = 0;
				for(int x : set1) y[c++] = x;
				System.out.println(y.toString());*/
		
}
}
