import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int n1 = numbers[numbers.length-1];
        int n2 = numbers[numbers.length-2];
        return n1 * n2;
    }
}