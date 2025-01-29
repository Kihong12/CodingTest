class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];
        int num = 0;
        for (int i : numbers) {
            result[num] = i*2;
            num++;
        }
        return result;
    }
}