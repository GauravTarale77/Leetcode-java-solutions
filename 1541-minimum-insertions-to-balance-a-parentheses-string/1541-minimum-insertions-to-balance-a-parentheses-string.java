class Solution {
    public int minInsertions(String s) {
        int st = 0, ed = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st++;
            }else{
                if(i + 1 < s.length() && s.charAt(i + 1) == ')'){
                    i++;
                }else{
                    ed++;
                }

                if(st > 0){
                    st--;
                }else{
                    ed++;
                }
            }
        }
        return ed + (st * 2);
    }
}