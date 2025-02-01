class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }

        int[] result = new int[cnt];
        cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result[cnt] = i;
                cnt++;
            }
        }
        return result;
    }
}   