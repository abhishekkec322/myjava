
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Practice {
	public static void main(String args[]) {
		
	List <Integer> intList = new ArrayList <>();	
	
	//Print Stream
	IntStream.range(1,10).forEach(System.out :: println);
	
	//Add Stream into List
	IntStream.range(0,9).forEach(intList :: add);
	System.out.println("intList :"+intList);
	
	//Return IntStream and then get count of elements.
	IntStream c = IntStream.range(1,7);
	System.out.println("integer Stream Count:"+c.count());
	
	/*for(Iterator i = c.iterator();i.hasNext(); ){
		
		System.out.println(i);
		i.next();
	}
	*/
	System.out.println("integer Stream :"+c);
		
	Stream <String> streamOfArray = Stream.of("aab","bb","aa");	
	List <String> list = Arrays.asList("sed","dada","", "daddddd", "ww", "", "qddasd");	
	
	Map <String,String> hm= new HashMap<String, String> ();
	
	hm.put("k1", "Val 1 word");
	hm.put("k2", "Val 2 test");
	hm.put("k3", "Val 2 word");
	int i=0;
	
	long result = 0;
    
	//Map -> Stream -> Filter -> String
    result = hm.entrySet().stream()
            .filter(map -> map.getValue().contains("test")).count();

    System.out.println("With Java 8 : " + result);    
	
	int count;	
	count = (int) list.stream().filter(string -> string.length()>3).count();
	System.out.println("Count :"+count);
	
	System.out.println("streamOfArray :"+streamOfArray.findFirst());
	
	}
}
