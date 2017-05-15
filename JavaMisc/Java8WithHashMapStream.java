import java.util.HashMap;
import java.util.Map;

public class Java8WithHashMapStream {
	
	public static void main(String args []){
		
		Map <String , String> myMap= new HashMap<>();
		
		myMap.put("k1", "This is Singapore");
		myMap.put("k2", "Singapore is where I am living");
		myMap.put("k3", "I am from India");
		myMap.put("k4", "We went to Bali");
		System.out.println("myMap : " +myMap);
		long count=0;
		count = myMap.entrySet().stream().filter(map -> map.getValue().contains("Singapore")).count();
		System.out.println("Count :"+count);
	}
}
