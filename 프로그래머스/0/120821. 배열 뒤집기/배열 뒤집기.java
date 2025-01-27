import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : num_list) {
            list.add(num);
        }
        
        Collections.reverse(list);
        
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}