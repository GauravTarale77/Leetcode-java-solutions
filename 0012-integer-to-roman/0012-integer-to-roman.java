class Solution {
    public String intToRoman(int num) {
        int Value[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String Symbol[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(num != 0){
            while(num >= Value[i]){
                sb.append(Symbol[i]);
                num -= Value[i];
            }
            i++;
        }
        String result = sb.toString();
        return result;
    }
}