import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> divisors = new ArrayList<>();
        
        // 1부터 n까지 반복하여 n의 약수를 찾음
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {  // 약수일 경우
                divisors.add(i);
            }
        }
        
        // List를 int[] 배열로 변환
        int[] result = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }
        
        return result;
    }
}
