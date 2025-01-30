class Solution {
    public int solution(int hp) {
        int a = hp / 5;
        int remainder = hp % 5;
        
        int b = remainder / 3;
        int c = remainder % 3;
        return a + b + c;
    }
}