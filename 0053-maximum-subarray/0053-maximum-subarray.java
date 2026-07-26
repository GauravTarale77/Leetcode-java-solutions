class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = 0;
        int maxN = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] <= 0){
                maxN = Math.max(maxN, nums[i]);
            }
            if(sum + nums[i] > 0){
                sum += nums[i];
                maxSum = Math.max(maxSum, sum);
            }else{
                sum = 0;
            }
        }
        if(maxSum == 0){
            return maxN;
        }else{
            return maxSum;
        }


    }
}