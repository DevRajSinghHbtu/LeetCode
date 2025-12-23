class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n != goal.length())
        return false;
        else
        {
            return (s + s).contains(goal);
        }
    }
}