import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
	  boolean isSpace = true;
	  StringBuilder sb = new StringBuilder();
	  for(char c : arr) {
	  if(c == ' ') {
	  isSpace = true;
	  sb.append(' ');
	  } else {
	  if(isSpace) {
	  if(c >= 'a' && c <= 'z') {
	  sb.append((char)(c - 'a' + 'A'));
	  } else {
	  sb.append(c);
	  }
	  isSpace = false;
	  } else {
	  if(c >= 'A' && c <= 'Z') {
	  sb.append((char)(c + 'a' - 'A'));
	  } else {
	  sb.append(c);
	  }
	  }
	  }
	  }
	  return sb.toString();
    }
}