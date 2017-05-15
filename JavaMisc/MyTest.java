import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyTest {
	
	public static void main(String args[]){
		
		List <String> ls = Arrays.asList("dd","bb", "aa");
		
		System.out.println("ls"+ls);
		java8sort(ls);
		System.out.println("after sort : "+ls);
		
		for(String ls2 : ls){
			System.out.println("ls : "+ls);
		}
		
		
		ls.forEach(System.out :: println);
		
	}
	
	public static List<String> java8sort(List <String> ls){
		
		Collections.sort(ls , (s1,s2) -> s1.compareTo(s2));
		
		System.out.println("In Sort Fun :"+ls);
		return ls;
		
	}

}
