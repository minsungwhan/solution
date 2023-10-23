import java.util.*;

class Solution {
	public static int[] solution(int N, int[] stages) {

		double count = 0;
		double fails = 0;
		double humanCount = 0;
		double[] fails2 = new double[N];

		for (int i = 1; i <= N; i++) {
			count = 0;
			fails = 0;

			for (int j = 0; j < stages.length; j++) {
				if (i == stages[j]) {
					count++;
					humanCount++;
				}
			}

			if (count == 0.0 ) {
				fails = 0.0;
			}

			else {
				fails = count / (((double) stages.length + count) - humanCount);

			}
			fails2[i - 1] = fails;
		}

		// System.out.println("-------------------");
		// for (int i = 0; i < fails2.length; i++) {
		// 	System.out.println(fails2[i]);
		// }
		// System.out.println("-------------------");

		double[] fails3 = new double[fails2.length];
		for (int i = 0; i < fails2.length; i++) {
			fails3[i] = fails2[i];
		}

		double[] uzi = new double[fails2.length]; // fails2 유지
		for (int i = 0; i < uzi.length; i++) {
			uzi[i] = fails2[i];
		}

		Arrays.sort(fails3);

		double[] fails4 = new double[fails3.length];

		int index = 0;

		for (int i = fails2.length - 1; i >= 0; i--) {
			fails4[index++] = fails3[i];
		}

		for (int i = 0; i < fails2.length; i++) {

			for (int j = 0; j < fails4.length; j++) {
				if (fails4[j] == fails2[i]) {
					fails4[j] = i + 1;
					fails2[i] = -1;
				}

			}

			for (int j = 0; j < uzi.length; j++)
				fails2[j] = uzi[j];
		}

		int[] answer = new int[fails4.length];

		for (int i = 0; i < fails4.length; i++) {

			answer[i] = (int) fails4[i];

		}

		return answer;

	}
}