class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int i = 1;

        if(nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }
        while(i < nums.length-1){
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                return nums[i];
            }
            i++;
        }
        return nums[0];
    }
}