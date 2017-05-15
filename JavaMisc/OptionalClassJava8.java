import java.util.Optional;

public class OptionalClassJava8 {	
	public static void main(String args []){
		
		OptionalClassJava8 optionalClassJava8 = new OptionalClassJava8();
		Integer value1=null;
		Integer value2= new Integer(11);		
		Optional <Integer> a = Optional.ofNullable(value1);
		Optional <Integer> b = Optional.ofNullable(value2);
		System.out.println("Sum : "+optionalClassJava8.sum(a,b));
	}
	public Integer sum(Optional <Integer> a, Optional <Integer> b){
		Integer val1 = a.orElse(new Integer(2));
		Integer val2 = b.orElse(new Integer (6));
		return val1+ val2;
	}
}
