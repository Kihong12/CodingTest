class Solution {
    public int[] solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int idx = 0;
        for (int a = 1; a <= n; a++) {
            if (a % 2 != 0) {
                result[idx] = a;
                idx++;
            }
        }
        return result;
    }
}