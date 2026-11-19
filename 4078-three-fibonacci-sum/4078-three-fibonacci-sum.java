class Solution {
    public boolean threeFibonacciSum(int n) {
        int prev2 = 0;
        int prev1 = 1;
        int current = 0;
        while(current < n){
            current = prev2 + prev1;
            if((current + prev1 + prev2) == n){
                return true;
            }
            prev2 = prev1;
            prev1 = current;    
        }
        return false;
    }
}