class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<digits.length; i++){
            for(int j = 0; j<digits.length; j++){
                for(int k = 0; k<digits.length; k++){
                    if(i == j || j == k || i == k){
                        continue;
                    }
                    if(digits[i] == 0){
                        continue;
                    }
                    int number = (digits[i]*100) + (digits[j]*10) + digits[k];

                    if(number % 2 == 0){
                        set.add(number);
                    }
                }
            }
        }
        return set.size();
    }
}