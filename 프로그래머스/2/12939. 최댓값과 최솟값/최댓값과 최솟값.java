class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
		int max = Integer.parseInt(a[0]);
		int min = Integer.parseInt(a[0]);
	
		
        
		for(int i  = 1 ; i <a.length ; i++) {
            
            
			if(min > Integer.parseInt(a[i]))
			min = Integer.parseInt(a[i]);
            
        }
        
        	for(int i  = 0 ; i <a.length ; i++) {
			if(max < Integer.parseInt(a[i]))
			max = Integer.parseInt(a[i]);
            }
			
	
        answer = min + " " + max ;
        return answer;
    }
}