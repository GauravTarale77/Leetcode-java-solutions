class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        StringBuilder sb = new StringBuilder();

        while(l1 >= 0 || l2 >= 0 || carry == 1){
            if(l1 >= 0){
                carry += a.charAt(l1--) - '0';
            }
            if(l2 >= 0){
                carry += b.charAt(l2--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}