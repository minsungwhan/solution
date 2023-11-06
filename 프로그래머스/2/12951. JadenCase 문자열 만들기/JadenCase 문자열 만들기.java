class Solution {
    public String solution(String s) {
		char[] arr = s.toCharArray();     //공백도 넣어준다.
		boolean isSpace = true; // 첫번째문자이면 true, 아니면 false
		StringBuilder sb = new StringBuilder();
		for (char c : arr) {
			if (c == ' ') { // 공백인 경우
				isSpace = true; // 공백다음 문자는 첫번째문자니까 true
				sb.append(' ');
			} else {
				if (isSpace) { // 첫번째 문자인 경우
					if (c >= 'a' && c <= 'z') { // 소문자인 경우
						sb.append((char) (c - 'a' + 'A'));
					} else {
						sb.append(c);
					}
					isSpace = false;
				} else { // 첫번째 문자가 아닌 경우
					if (c >= 'A' && c <= 'Z') { // 대문자인 경우
						sb.append((char) (c + 'a' - 'A'));
					} else {
						sb.append(c);
					}
				}
			}
		}
		return sb.toString();
	}
}





      // 태완센세
	  // public static String solution(String s) {
	  // char[] arr = s.toCharArray();
	  // boolean isSpace = true;
	  // StringBuilder sb = new StringBuilder();
	  // for(char c : arr) {
	  // if(c == ' ') {
	  // isSpace = true;
	  // sb.append(' ');
	  // } else {
	  // if(isSpace) {
	  // if(c >= 'a' && c <= 'z') {
	  // sb.append((char)(c - 'a' + 'A'));
	  // } else {
	  // sb.append(c);
	  // }
	  // isSpace = false;
	  // } else {
	  // if(c >= 'A' && c <= 'Z') {
	  // sb.append((char)(c + 'a' - 'A'));
	  // } else {
	  // sb.append(c);
	  // }
	  // }
	  // }
	  // }
	  // return sb.toString();