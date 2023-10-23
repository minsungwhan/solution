class Solution {
 
	
public static int solution(int number, int limit, int power) {

		int[] arr1 = new int[number];
		int index = 0;

		int[] arr2 = new int[number];
		int count = 0;
		int hap = 0;

		for (int i = 1; i <= number; i++) {
			arr1[index++] = i;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (i == 0)
				arr1[0] = 1;
			else if (i == 1)
				arr1[1] = 2;
			else if (i == 2)
				arr1[2] = 2;
			else if (i >= 3) {
				count = 0;
				for (int j = 1; j <=arr1[i] / 2; j++) {

					if (arr1[i] % j == 0 && arr1[i] / j > j) {
						count += 2;
					} if (arr1[i] % j == 0 && arr1[i] / j == j) {
						count++;
						break;
					}  if (arr1[i] % j == 0 &&arr1[i] / j < j)
						break;
				}

				if (count > limit)
					arr1[i] = power;
				else {
					arr1[i] = count;
				}

			}
             hap += arr1[i];
		}
		
		return hap ;

	}
}