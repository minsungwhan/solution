import java.util.*;

class Solution {
    boolean solution(String s) {


        Stack<Character> stack = new Stack<Character>();
        
    
        boolean answer = false;

  
        for (int i = 0; i < s.length(); i++) {
      
            if (i == 0 && s.charAt(i) == ')') {
                stack.push('1');
                break;
            }
          
            else if ( s.charAt(i) == '(') {
                stack.push('1');
            }
            else if (i != 0 && s.charAt(i) == ')' && stack.size() != 0) {
                stack.pop();
            }
        }


        return stack.empty()?true:false;
    }
}