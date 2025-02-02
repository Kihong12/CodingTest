class Solution {
    public int[] solution(int[] array) {
        int[] result = new int[2];
        int max = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        result[0] = max;
        
        int cnt = 0;
        for (int i : array) {
            if (i == max) {
                break;
            } else {
                cnt++;
            }
        }
        result[1] = cnt;
        return result;
    }
}