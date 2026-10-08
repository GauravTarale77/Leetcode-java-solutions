class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int prev = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if((ch == '(' && prev++ > 0) || (ch == ')' && --prev > 0)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}