class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int value = nums[0];

        for(int i = 0; i<nums.length; i++){
            map.add(nums[i]);
        }

        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                value += nums[i];
            }else{
                break;
            }
        }
        while(map.contains(value)){
            value++;
        }
        return value;
    }
}