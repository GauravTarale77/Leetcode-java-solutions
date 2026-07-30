class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int a = n / 8;
        int b = n % 8;
        return ((a * 4) + b) * (a + 1);
    }
}