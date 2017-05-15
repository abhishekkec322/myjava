package codiality;

import java.math.BigInteger;

public class StringBracket {
	public static void main (String args []){
	
		System.out.println(solution("(()"));

	}
	
	 public static int solution(String S) {
	        // write your code in Java SE 8
	        
	        if(S.isEmpty())
	        return 0;
	        
	        int countOpenBracket=0;
	        int countCloseBracket=0;
	        //int result=0;
	        
	        for(char c: S.toCharArray()){
	            if(c=='(')
	            countOpenBracket++;
	            
	            if(c==')')
	             countCloseBracket++;
	            }
	            
	            if(countOpenBracket>countCloseBracket){
	            return countOpenBracket;
	            }
	            else{ 
	            return countCloseBracket;
	            }
	            
	    }
}
