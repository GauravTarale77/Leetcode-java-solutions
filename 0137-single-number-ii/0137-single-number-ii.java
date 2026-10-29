class Solution {
    public int singleNumber(int[] nums) {
        int once = 0, twos = 0;

        for(int n : nums){
            once = (once ^ n) & ~twos;
            twos = (twos ^ n) & ~once;
        }
        return once;
    }
}