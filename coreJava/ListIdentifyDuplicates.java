package InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListIdentifyDuplicates {
	
	public static void main(String args []){
		List <Integer> ls = Arrays.asList(1,2,4,6,2,9,4,10,45,1);
	
		IdentifyDuplicates(ls);
		findDuplicatesMethod2(ls);
		findDuplicatesJava8(ls);
	}
	
	public static void IdentifyDuplicates(List <Integer> ls){
		
		System.out.println(ls);		
		Set <Integer> setFilteresDuplicates= new HashSet();
		Set <Integer> setWithoutDuplicates= new HashSet();
		
		for (Integer i : ls){
			if (! setWithoutDuplicates.add(i)){
				setFilteresDuplicates.add(i);
			}			
		}	
		System.out.println(setWithoutDuplicates);
		System.out.println("Method 1"+setFilteresDuplicates);
		
	}
	
	public static void findDuplicatesMethod2(List<Integer> input) {
	    List<Integer> copy = new ArrayList<Integer>(input);
	    for (Integer value : new HashSet<Integer>(input)) {
	        copy.remove(value);
	    }
	    System.out.println(" Method 2:"+copy);
	}
	
	 private static void findDuplicatesJava8(List<Integer> list) {
	        Set<Integer> uniques = new HashSet<Integer>();
	        System.out.println("Java 8 Streams"+list.stream().filter(e -> !uniques.add(e)).collect(Collectors.toSet()));
	    }

}
