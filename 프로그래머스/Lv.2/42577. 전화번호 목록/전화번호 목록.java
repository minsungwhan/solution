import java.util.List;
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        	Arrays.sort(phone_book);

 

            for (int j =0 ; j < phone_book.length-1; j++) {
                if ( phone_book[j+1].contains(phone_book[j]) && phone_book[j+1].indexOf(phone_book[j]) == 0) {
                    answer = false;
                    return answer;
                }
            }
        
        return answer;
    }
}