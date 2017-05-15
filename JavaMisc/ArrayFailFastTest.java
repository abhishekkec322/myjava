import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayFailFastTest {
	public static void main(String args[]){
		List <String> arrList = new ArrayList<String>();
		arrList.add(0, "aa");
		arrList.add(1, "bb");
		
		for (ListIterator <String> st = arrList.listIterator(); st.hasNext(); ){
			String s= st.next();
			System.out.println("I am here");
			arrList.add(2, "dd");
		}
	
	}

}
