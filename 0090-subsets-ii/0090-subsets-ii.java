class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        int subsets = 1 << n;

        for(int i = 0; i < subsets; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return new ArrayList<>(ans);
    }
}