
import java.util.Arrays;
import java.util.List;

public class JavaStream {

	public static void main(String args []){
		List <String> strings= Arrays.asList("abc" , "bcr45" , "", "a3" , "ssr", "", "de212r", "", "a");
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Count Empty Strings :" +count);
		count = strings.stream().filter(string -> string.length() >=3).count();
		System.out.println("Count of Strings with 3 or more characters:" +count);
		
	}
}
