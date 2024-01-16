
import java.util.*;

class Solution {
    public String solution(String X, String Y) {

		String answer = "";

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < X.length(); i++) {
			int index = Character.getNumericValue(X.charAt(i));
			arr1[index]++;
		}
		for (int i = 0; i < Y.length(); i++) {
			int index = Character.getNumericValue(Y.charAt(i));
			arr2[index]++;
		}

		for (int i = 9; i >= 0; i--) {
			if ((arr1[i] == arr2[i] && arr1[i] != 0 && arr2[i] != 0)
					|| (arr1[i] != 0 && arr2[i] != 0 && Math.abs((arr1[i]) - (arr2[i])) > 0)) {
			
				 for(int j = 0 ; j < (arr1[i]==arr2[i]?arr1[i]:arr1[i]>arr2[i]?arr2[i]:arr1[i]) ; j++)
					 builder.append(i);

			}
		}

		if (builder.length() == 0)
			return answer = "-1";

		else if (builder.charAt(0)=='0' && builder.charAt(builder.length()-1)=='0')
			return answer = "0";

		return builder.toString();
	}
    
}