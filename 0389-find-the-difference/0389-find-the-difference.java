class Solution {
    public char findTheDifference(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        int i = 0;

        while(i < s.length() && sChar[i] == tChar[i]){
            i++;
        }
        return tChar[i];
    }
}