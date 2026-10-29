class Solution {
    public int[] singleNumber(int[] nums) {
        int b1 = 0, b2 = 0;
        int XOR = 0;
        int[] ans = new int[2];

        for(int n : nums){
            XOR = XOR ^ n;
        }
        int first = (XOR & (XOR - 1)) ^ XOR;

        for(int n : nums){
            if((n & first) != 0){
                b1 = b1 ^ n;
            }else{
                b2 = b2 ^ n;
            }
        }
        ans[0] = b1;
        ans[1] = b2;

        return ans;
    }
}