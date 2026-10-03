class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowel = true;
                } else {
                    consonant = true;
                }
            }
        }

        return vowel && consonant;
    }
}