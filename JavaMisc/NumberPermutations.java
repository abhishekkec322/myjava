package codiality;
import java.util.HashSet;
import java.util.Set;

class NumberPermutations {

	static Set<String> insertIntoSet = new HashSet<String>();

	public static void main(String[] args) {

		int N = 10100;

		int finalCount = findAllPerm(N);
		System.out.println(insertIntoSet);
		System.out.println(finalCount);
		
	}

	static int findAllPerm(int num) {
		
		String numString = String.valueOf(num);

		int count = findPerm(numString, "");
		return count;

	}
	
	
static int findPerm(String numString, String blankString) {
		
		if (numString == null || numString.length() < 2) {
			return 1;
		}

		if (numString.length() == 2) {
			String tempStr = "";
			tempStr = blankString + numString;
			if (!tempStr.startsWith("0"))
				insertIntoSet.add(tempStr);
			tempStr = blankString + new StringBuffer(numString).reverse().toString();
			if (!tempStr.startsWith("0"))
				insertIntoSet.add(tempStr);
		}

		for (int i = 0; i < numString.length(); i++) {
			char c = numString.charAt(i);
			String temp = "";
			for (int j = 0; j < numString.length(); j++) {
				if (i != j) {
					temp += numString.charAt(j);
				}
			}
			findPerm(temp, blankString + c);
		}
		return insertIntoSet.size();

	}
	

}
