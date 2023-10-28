import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for(int i = 0 ; i < n ; i++) {
    		arr.add(num_list[i]);
    	}
    	int[] arr2 = new int[arr.size()];
    	for(int j = 0 ;  j <arr.size() ; j++)
    		arr2[j] = arr.get(j);
      
        return arr2;
    }
}