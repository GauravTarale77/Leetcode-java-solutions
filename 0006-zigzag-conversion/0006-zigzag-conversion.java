class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }

        int idx = 0, val = 1;

        ArrayList<Character> Rows[] = new ArrayList[numRows];

        for(int i = 0; i<numRows; i++){
            Rows[i] = new ArrayList<>();
        }

        for(char c : s.toCharArray()){
            Rows[idx].add(c);

            if(idx == 0){
                val = 1;
            }else if(idx == numRows - 1){
                val = -1;
            }

            idx += val;
        }

        StringBuilder sb = new StringBuilder();

        for(ArrayList<Character> row : Rows){
            for(char c : row){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}