class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 2;
        int temp = nums[0];
        int tempans = 2;
        for(int i = 1; i < nums.length - 1; i++){
            temp += nums[i];
            if(temp == nums[i+1]){
                tempans++;
                ans = Math.max(tempans, ans);
            }else{
                tempans = 2;
            }
            temp = nums[i];
        }
        return ans;
    }
}