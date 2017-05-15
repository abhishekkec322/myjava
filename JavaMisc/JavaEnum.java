
public class JavaEnum {
	
	public enum test  {test1, test2, test3};
	
	public static boolean inEnumType(String name)
	{
	   try
	   {
		   test.valueOf(name);
	      return true;
	   }
	   catch(Exception e)
	   {
	      return false;
	   }
	}

	public static void main(String args []){
		
		  System.out.println("One exists: " + inEnumType("test1"));
		   System.out.println("Two exists: " + inEnumType("test2"));
		   System.out.println("Three exists: " + inEnumType("Three"));
		   System.out.println("Four exists: " + inEnumType("Four"));
		   
	}

}
