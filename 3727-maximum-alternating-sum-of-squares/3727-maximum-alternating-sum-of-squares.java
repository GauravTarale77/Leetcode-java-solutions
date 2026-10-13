class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] temp = new long[nums.length];

        for(int i = 0; i < nums.length; i++){
            temp[i] = (long)nums[i] * nums[i];
        }

        Arrays.sort(temp);

        long ans = 0;
        int k = nums.length / 2;

        for(int i = 0; i < k; i++){
            ans -= temp[i];
        }
        for(int i = k; i < nums.length; i++){
            ans += temp[i];
        }

        return ans;
    }
}