class Solution {
    public boolean isPowerOfFour(int n) {
        int count1 = 0, count0 = 0;

        while(n > 0){
            if((n & 1) == 1){
                count1++;
            }else{
                count0++;
            }
            n >>= 1;
        }
        if(count1 == 1 && (count0 % 2 == 0)){
            return true;
        }
        return false;
    }
}