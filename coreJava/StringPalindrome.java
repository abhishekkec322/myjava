package InterviewPrep;

public class StringPalindrome {
	
	public static void main(String args []){
			
		System.out.println(isPalindrome("cabdbac"));
		System.out.println(usingStringBuilder("2cabdbac2"));
		System.out.println(usingRecursion("2cabdbac"));
	}
	
	static boolean isPalindrome(String str){		
		int n = str.length();		
		
		for(int i=0;i<n/2;i++){
			if(str.charAt(i) != str.charAt(n-i-1))
			return false;
		}
		return true;
	}
	
	static boolean usingStringBuilder(String str)
	{	
		return (str.equals(new StringBuilder(str).reverse().toString()) == true)? true : false;
	}
	
	static boolean usingRecursion(String str)
	{	
		if(str.length() == 0 || str.length() == 1)
            return true; 
        if(str.charAt(0) == str.charAt(str.length()-1))
        return usingRecursion(str.substring(1, str.length()-1));
        return false;
	}	
}
	
	

