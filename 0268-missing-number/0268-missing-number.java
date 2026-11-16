class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int temp = -1;
        for(int i = 0; i < n; i++){
            temp++;
            if(temp != nums[i]){
                return temp;
            }
        }
        return temp + 1;
    }
}