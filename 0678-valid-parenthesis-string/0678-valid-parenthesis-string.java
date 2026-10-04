class Solution {
    public boolean checkValidString(String s) {
        int st = 0, ed = 0;

        for(int i = 0; i<s.length(); i++){
            st += s.charAt(i) == '(' ? 1 : -1;
            ed += s.charAt(i) == ')' ? -1 : 1;

            if(ed < 0){
                return false;
            }

            st = Math.max(st, 0);
        }
        return st == 0;
    }
}