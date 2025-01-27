class Solution {
    public int solution(int n) {
        int count = 0;
        
        // 1부터 n까지의 모든 숫자에 대해 나누어지는지를 확인
        for (int a = 1; a <= Math.sqrt(n); a++) {
            if (n % a == 0) { // n이 a로 나누어지면
                int b = n / a; // b는 자동으로 결정
                count++; // (a, b) 순서쌍을 하나 찾음
                if (a != b) { // a != b이면 (b, a)도 순서쌍으로 추가
                    count++;
                }
            }
        }
        
        return count;
    }
}