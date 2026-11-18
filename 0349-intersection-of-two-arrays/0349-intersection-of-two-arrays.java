class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();

        for(int a : nums1){
            set1.add(a);
        }
        
        HashSet<Integer> set2 = new HashSet<>();
        for(int a : nums2){
            if(set1.contains(a)){
                set2.add(a);
            }
        }

        int[] ans = new int[set2.size()];
        int i = 0;
        for(int a : set2){
            ans[i] = a;
            i++;
        }
        return ans;
    }
}