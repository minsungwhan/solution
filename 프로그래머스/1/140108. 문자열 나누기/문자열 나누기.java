class Solution {
    public int solution(String s) {

		int secondcnt = 0; // 기준과다른거
		int firstcnt = 1; // 기준과 같은거
		char firstchar = s.charAt(0); // 고정 char
		int substringcnt = 0; // 나눠진거 갯수
        
        if(s.length() == 1)
            return 1;

		for (int i = 1; i < s.length(); i++) {

			// if (i == s.length() - 1 && secondcnt == 0  && firstcnt >=0){
			// 	substringcnt++;
			// break;
			// }
            
            if(i == s.length()-1 && (firstcnt-secondcnt == 0 || Math.abs(firstcnt-secondcnt) >=1 )){
               	substringcnt++;
			    break;
            }
				

			if (s.charAt(i) == firstchar) {
				firstcnt++;
				continue;
			} else if (s.charAt(i) != firstchar) {
				secondcnt++;

				if (firstcnt == secondcnt) {
					substringcnt++;
					firstcnt = 0;
					secondcnt = 0;
					if (i + 1 < s.length()) {
						firstchar = s.charAt(i + 1);
					}
				}

			}
		}
		return substringcnt;
    }
}