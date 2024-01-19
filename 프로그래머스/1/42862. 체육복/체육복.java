class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
     int[] whole = new int[n + 1];
        whole[0] = 0;

        // 모두에게 한벌을 준다
        for (int i = 1; i < whole.length; i++) {
            whole[i] = 1;
        }

        // 여분가져온 친구들 하나씩 더 준다
        for (int i = 0; i < reserve.length; i++) {
            int plusmember = reserve[i];
            whole[plusmember] += 1;
        }

        // 도둑맞은 친구들 한벌씩 뺀다
        for (int i = 0; i < lost.length; i++) {
            int lostnumber = lost[i];
            whole[lostnumber] -= 1;
        }

        // 빌려주기
        for (int i = 1; i < whole.length; i++) {
            if (whole[i] == 0) {
                if (i - 1 >= 1 && whole[i - 1] == 2) {
                    whole[i - 1] -= 1;
                    whole[i] += 1;
                } else if (i + 1 <= n && whole[i + 1] == 2) {
                    whole[i + 1] -= 1;
                    whole[i] += 1;
                }
            }
        }

        int answer = 0;

        for (int i = 1; i < whole.length; i++) {
            if (whole[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}