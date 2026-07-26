class Solution {
    public boolean isPalindrome(int x) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(x < 0){
            return false;
        }
        while(x != 0){
            int n = x % 10;
            arr.add(n);
            x /= 10;
        }
        for(int i = 0; i<arr.size()/2; i++){
            if(arr.get(i) != arr.get(arr.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}