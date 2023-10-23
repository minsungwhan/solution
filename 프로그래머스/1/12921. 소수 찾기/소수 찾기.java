
class Solution {

    public static int solution(int n) {

        int count = 0;

        if (n <= 1)
            return 0;

        aa: for (int i = 2; i <= n; i++) {
            if (i == 2 || i == 3 || i == 5 ||i==7)
                count++;

            else {
                for (int j = 2; j*j <= i ; j++) {
                    if (i % j == 0)
                        continue aa;

                }
                count++;

            }

        }
        return count;

    }
}