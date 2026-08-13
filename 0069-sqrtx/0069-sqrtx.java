class Solution {
    public int mySqrt(int x) {
        long result = 0;
        while(x >= result*result){
            result++;
        }
        return (int) result-1;
    }
}