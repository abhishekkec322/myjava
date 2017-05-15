package codiality;
import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
	
	public static void main(String args[]){
		
		String roman = "";
		int romToInt=0;
		for(int n=0;n<=101;n++)
		{
			roman = intToRom(n);
			System.out.println(roman);
			romToInt= romanToInt(roman);
			System.out.println(romToInt);
		}
	}
	
	public static String intToRom(int n){
		
		String[] rnChars = { "M",   "CM",  "D", "CD",  "C",   "XC",  "L",  "XL",  "X", "IX",  "V",  "IV", "I" };
		int[] rnVals = 	   {  1000,  900,  500,  400  , 100,   90,    50,   40 ,   10,   9,    5,    4,    1  };
		String returnVal="";
		
		for (int i = 0; i < rnVals.length; i++) {
	           while (n >= rnVals[i]) {
	        	   //returnVal += rnChars[i];
	        	   returnVal=returnVal.concat(rnChars[i]);
	            //  n -= rnVals[i];
	        	   n=n- rnVals[i];
	           }
	        }
	        return returnVal;
	}
	
	public static int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;
         
        // create a hash table to store the dictorary
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
         
        int num = 0;
         
        for (int i = 0; i < s.length(); i++) {
            if (i <= s.length() - 2 && 
                hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
                num -= hashMap.get(s.charAt(i));
            } else {
                num += hashMap.get(s.charAt(i));
            }
        }
        return num;
    }

}
