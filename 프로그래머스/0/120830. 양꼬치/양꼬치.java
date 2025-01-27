class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int meat = n * 12000;
        int drink = k * 2000;
        int free_drink = (n / 10) * 2000;
        answer = meat + drink - free_drink;
        return answer;
    }
}