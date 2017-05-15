import java.util.ArrayList;
import java.util.List;

public class MethodReference {
	public static void main(String args []){
		List <String> names= new ArrayList<String>();		
		names.add("Abhi");
		names.add("neha");
		names.add("cherry");
		names.forEach(System.out :: println);		
	}
}
