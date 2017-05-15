package codiality;

import java.util.Arrays;

public class LongestpasswordString {
	public static void main(String args []){
		
		
		System.out.println(longestPassword("bvff65FFF"));
	}

	public static int longestPassword(String S){

		/*//Split string by space
		String[] split = S.split(" ");
		ArrayList<Integer> passwordList = new ArrayList<>();

		//Check and add valid password's length to array
		for(String each:split){
		if(each.matches("^[a-zA-Z0-9]*$")){
		int digits = each.replaceAll("[^0-9.]","").length();
		int alpha = each.length() - digits;

		if(digits%2!=0 && alpha%2==0){
		passwordList.add(each.length());
		}
		}
		}
		//Find max length password else return -1
		if(passwordList.size() > 0){
		Collections.sort(passwordList);
		return passwordList.get(passwordList.size()-1);
		}
		else
		return -1;
		}*/
		
		final int result = Arrays.stream(S.split("[0-9]+")).filter(s -> s.matches("(.+)?[A-Z](.+)?")).sorted((s1, s2) -> s2.length() - s1.length()).findFirst()
				.orElse("").length();
				
		return (result>0)?result :-1;
}
}
