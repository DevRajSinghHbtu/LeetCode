class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int c = 0;
        for(int i = 0;i<s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                c++;
            }
            else if(s.charAt(i) == ')')
            {
                max = Math.max(max, c);
                c = c - 1;
            }
        }
        return max;
    }
}