class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> repeated = new HashSet<>();
        HashSet<String> set = new HashSet<>();
        int n = s.length();

        for(int i = 0; i + 9 < n; i++){
            String substr = s.substring(i, i+10);
            if(!set.add(substr)){
                repeated.add(substr);
            }
        }
        return new ArrayList<>(repeated);
    }
}