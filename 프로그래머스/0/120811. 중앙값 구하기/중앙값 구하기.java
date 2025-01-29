import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] result = Arrays.stream(array).sorted().toArray();
        int i = result.length / 2;
        return result[i];
    }
}
