import java.util.*;

class Solution
{
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		Integer[] b = new Integer[B.length];

		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < B.length; i++) {
			b[i] = B[i];
		}

		Arrays.sort(b, Collections.reverseOrder());

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * b[i];
		}

		return answer;
	}

}