class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int M= 0;
        for(int i =0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if(ch == '('){
                count++;
                M = Math.max(M , count);
            }
            if(ch == ')'){
                count--;
            }
            

        }
        return M;
    }
}