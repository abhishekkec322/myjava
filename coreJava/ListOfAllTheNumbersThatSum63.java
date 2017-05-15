package InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListOfAllTheNumbersThatSum63 {
	
	public static void main(String args[]){
		
		int n=14;
		int s=7;
		
		findUsingForLoop(n,s); // n^2

		findPairsEqualsToXWithoutConvertingArray(n,s); //nlogn
		
		countPairsWithSum_ByHashMap(n,s);
		}
	
	static void findUsingForLoop(int n, int s){		
		//HashMap <Integer,Integer> hm = new HashMap<>();
		//Complexity n^2
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++)
			{
				if((i+j)==s)
				//hm.put(i, j);
					System.out.printf("(%d, %d) %n", i, j);
				}	
			}
		//System.out.println(hm);
	}
	

		 	
	static void findPairsEqualsToXWithoutConvertingArray(int n, int s){
		  if (n < 2)
		   return;
		  System.out.println("The pair whose sum is equal to 9 : ");
		  int l = 1, r = n - 1;
		  while (l < r) {
		   if ((l + r) == s) {
		    System.out.println(l + "," + r);
		    l++;
		    r--;
		   } else if ((l + r) < s)
		    l++;
		   else
		    r--;
		  }
		}
	
	private static void countPairsWithSum_ByHashMap(int n, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapPairs = new HashMap<Integer, Integer>();
		
		//Find and store frequency of each number in array
		for(int num=1;num<=n;num++){
			//if(map.containsKey(num)){
				//int count = map.get(num);
				//map.put(num, count + 1);
			//}else{
				map.put(num, 1);
		//	}
		} 
		System.out.println("Total map : "+map);
				int pairs = 0;
		for(int num=1;num<=n;num++){
			if(map.containsKey(sum - num)){
				{
				pairs += map.get(sum - num);	//counting each pair 2 times
				
				mapPairs.put((num), (sum-num));
				}
				//Condition for case {1,1,1,1} : 2
				if(sum - num == num){
					pairs--;
				}
			}
		}
		
	for(int i=0;i<mapPairs.size();i++)
	{
		if(mapPairs.containsKey(mapPairs.get(i)))
		{
			mapPairs.remove(mapPairs.get(i));			
			
		}
	}
		//Divide by 2 as we counted each pair twice
		System.out.println("Total pairs count with sum 7: "+pairs/2);
		System.out.println("Pairs with sum 9: "+mapPairs);
	}
}		



