class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int level = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (level > 0) {
                    sb.append(ch);
                }
                level++;
            } else {
                level--;
                if (level > 0) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}