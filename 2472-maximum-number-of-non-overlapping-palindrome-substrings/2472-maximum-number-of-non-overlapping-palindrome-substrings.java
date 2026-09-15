class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();

        if(k == 1){
            return n;
        }

        int res = 0;

        for(int i = 0; i <= n-k; i++){
            if(isPalindrome(s, i, i + k - 1)){
                res++;
                i += k-1;
            }else if(i < n - k && isPalindrome(s, i, i + k)){
                res++;
                i += k;
            }
        }
        return res;
    }
    private boolean isPalindrome(String s, int i, int j){
        for(; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}