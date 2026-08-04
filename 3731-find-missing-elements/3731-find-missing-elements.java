class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        int small = nums[0] + 1;
        int large = nums[nums.length-1];
        int i = 1;
        
        while(small < large){
            if(small != nums[i]){
                result.add(small);
                small++;
            }else{
                i++;
                small++;
            }
        }
        return result;
    }
}