class Solution {
    public String solution(String rsp) {
        char[] cRsp = rsp.toCharArray();
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < cRsp.length; i++) {
            switch (cRsp[i]) {
                case '2':
                    answer.append('0');
                    break;
                case '0':
                    answer.append('5');
                    break;
                case '5':
                    answer.append('2');
                    break;
            }
        }
        return answer.toString();
    }
}