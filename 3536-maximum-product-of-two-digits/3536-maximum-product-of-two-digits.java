class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> digit = new ArrayList<>();

        while(n != 0){
            digit.add(n%10);
            n = n/10;
        }
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0; i<digit.size(); i++){
            for(int j=i+1; j<digit.size(); j++){
                maxProduct = Math.max(maxProduct, digit.get(i)*digit.get(j));
            }
        }
        return maxProduct;
    }
}