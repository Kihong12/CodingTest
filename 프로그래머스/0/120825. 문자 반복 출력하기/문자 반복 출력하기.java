class Solution {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            for (int i = 0; i < n; i++) {
                result.append(c);
            }
        }
        return result.toString();
    }
}