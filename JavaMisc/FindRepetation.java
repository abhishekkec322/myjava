package codiality;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class FindRepetation {
	
	public static void main(String args[]){

		List <String> strings= new ArrayList();
		strings.add("aa");
		strings.add("bb");
		strings.add("cc");
		strings.add("aa");
		strings.add("dd");
		strings.add("aa");
		strings.add("bb");
		strings.add("aaa");
				//Arrays.asList("abc" , "abc" , "aa", "cc" , "dd", "abc", "cc", "dd", "abc");
		
		int i=0;
		Set<String> set = new HashSet<String>();
		
		for(ListIterator <String>it= strings.listIterator();it.hasNext();) {
			set.add(strings.get(i));
			it.next();
			i++;
		}
		System.out.println(set);
		
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		
		count = strings.stream().filter(string -> string.length() >=3).count();
		
		
	}

}
