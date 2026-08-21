class Solution {
    public boolean isHappy(int n) {
        int prod = 0;
        int val = n;
        int count = 0; 
        while(n != 1 && count != 7){
            if(val != 0){
                int temp = val % 10;
                prod += Math.pow(temp, 2);
                val /= 10;
            }else{
                n = prod;
                val = prod;
                prod = 0;
                count++;
            }
        }
        if(n == 1){
            return true;
        }
        return false;
    }
}