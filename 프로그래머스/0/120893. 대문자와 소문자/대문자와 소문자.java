class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
}