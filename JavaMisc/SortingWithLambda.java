import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithLambda {
	
	public static void main (String args []){
		System.out.println("Hello World !!!");
		
		List <String> names = new ArrayList <String> ();
		
		names.add("robin");
		names.add("advika");
		names.add("abhishek");
		names.add("neha");
		names.add("cherry");
		
		java8Sorting(names);
		System.out.println("names sorted in calling method java8Sorting:"+names);		
		
		java7Sorting(names);
		System.out.println("names sorted in calling method java7Sorting:"+names);
	}
	
	private static void java8Sorting(List <String> names){
		Collections.sort(names, (s1,s2) -> s1.compareTo(s2));
		System.out.println("names sorted Java 8:"+names);
	}
	
	private static void java7Sorting (List <String> names){
		Collections.sort(names, new Comparator<String>() {
		
		@Override
		public int compare(String s1, String s2){
			return s1.compareTo(s2);
			}
		});

	}
}
