class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        String rev = "";
        int e = n;

        for (int i = n - 1; i >= 0; i--) {

            // Skip extra spaces
            if (s.charAt(i) == ' ') {
                e = i;
                continue;
            }

            // Start of a word
            if (i == 0 || s.charAt(i - 1) == ' ') {
                rev = rev + s.substring(i, e) + " ";
            }
        }

        return rev.trim();
    }
}