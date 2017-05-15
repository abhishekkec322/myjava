package InterviewPrep;

public class SmallestSubsetIntegerOfArrays {
	
	public static void main (String ar[]){
				
		//comment this and add static to smallestIntSubset. Also remove "a."
		SmallestSubsetIntegerOfArrays a= new SmallestSubsetIntegerOfArrays();
		
		int arr1[]={1,1,3,4,5,9};
		int arr2[] = {1, 2, 6, 10, 11, 15};
		int arr3[] = {1, 1, 1, 1};
		int arr4[] = {1, 2, 4, 5, 6, 8};
		int arr5[] = {1, 2, 4};		
		
		System.out.println(a.smallestIntSubset(arr1));
		System.out.println(a.smallestIntSubset(arr2));
		System.out.println(a.smallestIntSubset(arr3));
		System.out.println(a.smallestIntSubset(arr4));
		System.out.println(a.smallestIntSubset(arr5));
	}
	
	 int smallestIntSubset(int arr []){
		 int result = 1;
			for(int i = 0;i<arr.length;i++){
				if(arr[i]<=result){
					result += arr[i];
	 			}else{
	 				break;
	 			}
			}
		return result;
	}
}
