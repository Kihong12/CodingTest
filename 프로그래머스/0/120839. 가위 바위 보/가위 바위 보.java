class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();

        for (char ch : rsp.toCharArray()) {
            if (ch == '2') {
                result.append('0');
            } else if (ch == '0') {
                result.append('5');
            } else  {
                result.append('2');
            }
        }
        return result.toString();
    }
}