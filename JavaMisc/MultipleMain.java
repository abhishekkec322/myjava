public class MultipleMain{

  public static void main(String args []){
	  main(1);
	  main('C');
	  main("My Overloaded Main");
  }
  
  public static void main (int i){
	  System.out.println("Integer : "+i);
  }
  public static void main(char c){
	  System.out.println("Character :"+c);
  }
  public static void main(String str){
	  System.out.println("String :"+str);
  }
}