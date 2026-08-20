class Solution {
    public int[] resultArray(int[] nums) {
       int[] arr1 = new int[nums.length];
       int[] arr2 = new int[nums.length];

        int idx1 = 0, idx2 = 0;

        arr1[idx1++] = nums[0];
        arr2[idx2++] = nums[1];

        for(int i = 2; i<nums.length; i++){
            if(arr1[idx1 - 1] > arr2[idx2 - 1]){
                arr1[idx1++] = nums[i];
            }else{
                arr2[idx2++] = nums[i];
            }
        }

        for(int i = 0; i<idx2; i++){
            arr1[idx1++] = arr2[i];
        }

        return arr1;
    }
}