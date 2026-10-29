class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;

        while(n > 0 && nums[n-1] >= nums[n]){
            n--;
        }
        if(n == 0){
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int j = nums.length - 1;
        while(j >= n && nums[j] <= nums[n-1]){
            j--;
        }
        swap(nums, n-1, j);
        reverse(nums, n, nums.length-1);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}