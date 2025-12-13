class Solution {
    public String oddString(String[] words) {
        int m = words.length;
        int n = words[0].length();

        // Compute difference arrays for first three words only
        int[] diff0 = getDiff(words[0]);
        int[] diff1 = getDiff(words[1]);
        int[] diff2 = getDiff(words[2]);

        // If first two are same, odd one is later
        if (same(diff0, diff1)) {
            for (int i = 2; i < m; i++) {
                if (!same(diff0, getDiff(words[i]))) {
                    return words[i];
                }
            }
        }
        // Otherwise, one of the first two is odd
        else {
            return same(diff0, diff2) ? words[1] : words[0];
        }

        return "";
    }

    // Helper to compute difference array
    private int[] getDiff(String s) {
        int[] diff = new int[s.length() - 1];
        for (int i = 0; i < s.length() - 1; i++) {
            diff[i] = (s.charAt(i + 1) - 'a') - (s.charAt(i) - 'a');
        }
        return diff;
    }

    // Helper to compare two arrays
    private boolean same(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
