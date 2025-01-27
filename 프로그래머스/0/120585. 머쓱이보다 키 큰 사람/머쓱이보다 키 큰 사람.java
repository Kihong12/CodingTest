class Solution {
    public int solution(int[] array, int height) {
        int result = 0;
         for (int i : array) {
             if ( i > height) {
                 result++;
             } 
         }
        return result;
    }
}