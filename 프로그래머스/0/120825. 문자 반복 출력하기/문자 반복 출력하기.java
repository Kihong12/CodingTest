class Solution {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();
        
        // 문자열을 순회하며 각 문자를 n번 반복
        for (char c : my_string.toCharArray()) {
            for (int i = 0; i < n; i++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}