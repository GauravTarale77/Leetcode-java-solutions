class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1;
        int val = n;
        while(n != 0){
            int temp = n % 10;
            sum += temp;
            prod *= temp;
            n /= 10;
        }
        int total = sum + prod;
        if(val % total == 0){
            return true;
        }
        return false;
    }
}