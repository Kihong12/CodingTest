class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        for (int i : numlist) {
            if (i % n == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int num = 0;
        for (int a : numlist) {
            if (a % n == 0) {
                result[num] = a;
                num++;
            }
        }
        return result;
    }
}