class Solution {
    public boolean isValid(String word) {

        if (word.length() < 3) {
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            // Invalid character
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Letter
            if (Character.isLetter(ch)) {

                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                    vowel = true;

                } else {

                    consonant = true;
                }
            }
        }

        return vowel && consonant;
    }
}