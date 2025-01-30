class Solution {
    public int solution(String my_string) {
        int sum = 0;
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }
}