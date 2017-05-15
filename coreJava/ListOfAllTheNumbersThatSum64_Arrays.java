package InterviewPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class ListOfAllTheNumbersThatSum64_Arrays {
	
	 public static void main(String args[])
	    {
	        int[] arr = { 1, 5, 7, -1, 5 };
	        int arr2[]={1,1,2,3,4,5,6,7,8,9,10};
	        int sum = 6;
	        getPairsCount(arr2, 9);
	        findPairsEqualsToX(10,9);
	        
	       
		    
	        findPairsEqualsToXUsingHashing(arr2,sum);
	        pairSumFastest(arr2, 9);
	    }
	 
	 public static void getPairsCount(int[] arr, int sum)
	    {
	        int count = 0;// Initialize result
	        // Consider all possible pairs and check their sums
	        //sort the ist first if not sorted already and remove duplicates.
	        for (int i = 0; i < arr.length; i++)
	            for (int j = i + 1; j < arr.length; j++)
	                if ((arr[i] + arr[j]) == sum){
	                    count++;
	                    System.out.printf("Pairs : (%d, %d) %n", arr[i], arr[j]);
	                }
	        System.out.printf("Count of pairs is %d",count);
	    }
	 	
		public static void findPairsEqualsToXUsingHashing(int arr[], int X) {
			  HashMap<Integer, Integer> elementIndexMap = new HashMap<Integer, Integer>();
			  //{1,2,3,4,5,6,7,8,9,10};
			  for (int i = 1; i < arr.length; i++) {
				  elementIndexMap.put(arr[i], i);
			  }
			  System.out.println("omplete Hash Map: "+elementIndexMap);
			  System.out.println("The pair whose sum is closest to 6 *************: ");
			  for (int i = 0; i < arr.length; i++) {
			   if (elementIndexMap.get(X - arr[i]) != null && elementIndexMap.get(X - arr[i]) != i) //
			   {
			    System.out.println(arr[i] + " " + (X - arr[i]));
			   }
			}
		}

		public static void findPairsEqualsToX(int num, int X) {
			int arr[] = new int [num-1];		
			for(int a=1;a<num-1;a++){
				arr[a]=a;
			}				
			//int arr[]={1,2,3,4,5,6,7,8,9,10};
			 //nlog(n)
			  int n = arr.length;
			  if (n < 2)
			   return;
			  //Arrays.sort(arr); // Sort if array is not already sorted.
			  System.out.println("");
			  System.out.println("The pair whose sum is equal to 9 : ");
			  // left and right index variables
			  int l = 1, r = n - 1;
			  while (l < r) {
			   if ((arr[l] + arr[r]) == X) {
			    System.out.println(arr[l] + "," + arr[r]);
			    l++;
			    r--;
			   } else if (arr[l] + arr[r] < X)
			    l++;
			   else
			    r--;
			  }
		}
		
		public static void pairSumFastest(int[] data, int sum) {
		    ArrayList<String> results = new ArrayList<String>();
		    int low = 0;
		    int high = data.length - 1;
		    while (low < high) {
		        while (low < high && data[low] + data[high] < sum) {
		            low++;
		        }
		        while (low < high && data[low] + data[high] > sum) {
		            high--;
		        }
		        if (low < high) {
		            results.add( data[low] + " and " + data[high]);
		            low++;
		            high--;
		        }
		    }

		 System.out.println("Final Results  :"+results);
		}
	    
	}
		



