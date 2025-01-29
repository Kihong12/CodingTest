class Solution {
    public int solution(int[] array, int n) {
        int result = 0;
        for (int i : array) {
            if (i == n) {
                result++;
            }
        }
        return result;
    }
}