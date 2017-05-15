
public class Lambda {

	public static void main(String args[]){

		
		Lambda java8Tester = new Lambda();
		MathOperation addition =(int a, int b) -> a+b;
		MathOperation substraction = (a,b) -> a-b;
		MathOperation multiplication = (int a , int b) -> {
			return a*b;
		};
		MathOperation division = (a,b) -> a/b;
		MathOperation2 square = a -> (a*a);
		
		
		System.out.println("Print addition : " + java8Tester.operation(5, 6, addition));
		System.out.println("Print substraction : " + java8Tester.operation(9, 6, substraction));
		System.out.println("Print multiplication : " + java8Tester.operation(5, 6, multiplication));
		System.out.println("Print division : " + java8Tester.operation(9, 3, division));
		System.out.println("Print Square : " + java8Tester.operation2(4, square));
	}
	interface MathOperation{
		int operation (int a, int b);
	}
	private int operation (int a, int b, MathOperation mathoperation){
		return mathoperation.operation(a, b);
	}
	interface MathOperation2{
		int operation (int a);
	}
	private int operation2 (int a, MathOperation2 mathoperation2){
		return mathoperation2.operation(a);
	}
}
