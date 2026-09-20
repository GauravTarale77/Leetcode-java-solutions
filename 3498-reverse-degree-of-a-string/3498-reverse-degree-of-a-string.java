class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int temp = Math.abs((ch - 'z') - 1);
            ans += temp * (i + 1);
        }
        return ans;
    }
}