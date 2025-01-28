class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];

        for (int n : num_list) {
            if (n % 2 == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        return result;
    }
}