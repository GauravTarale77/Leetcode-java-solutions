class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0, end = n - 1;
        int ans = 0;

        while(start < end){
            int ht = Math.min(height[start], height[end]);
            int wt = end - start;
            ans = Math.max(ans, ht*wt);
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }
        return ans;
    }
}