class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1, temp = 1;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] < nums[i + 1]){
                temp++;
                ans = Math.max(ans, temp);
            }else{
                temp = 1;
            }
        }

        temp = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i + 1]){
                temp++;
                ans = Math.max(ans, temp);
            }else{
                temp = 1;
            }
        }
        
        return ans;
    }
}