class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1000000007;

        int result = 0;
        int dp[] = new int[26];

        for(int i = 0; i<s.length(); i++){
            int curr = s.charAt(i) - 'a';
            int add = (result - dp[curr] + MOD) % MOD;

            dp[curr] = result + 1;
            result = (dp[curr] + add) % MOD;
        }
        return result;
    }
}