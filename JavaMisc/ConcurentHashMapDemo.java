import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
public class ConcurentHashMapDemo {
	
	public static void main(String args []){
		ConcurrentHashMap <String, String> myPhone= new ConcurrentHashMap<>();
		myPhone.put("1", "Motorola");
		myPhone.put("2", "Nokia");
		myPhone.put("3", "Samsung");
		
		Iterator <String> iterator = myPhone.keySet().iterator();
		while(iterator.hasNext()){
			
			System.out.println("Print :" +myPhone.get(iterator.next()));
			myPhone.put("4", "Apple");
		}
		
	}

}
