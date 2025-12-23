class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n == goal.length())
        {
             for(int i = 0;i<n;i++)
        {
            if(goal.charAt(0) != s.charAt(i))
            {
                continue;
            }
            else
            {
                if(i == 0)
                {
                    if(s.equals(goal))
                    {
                        return true;
                    }
                }
              else if((s.substring(i, n-1)).equals(goal.substring(0, n-1-i)) && (s.substring(0, i-1)).equals(goal.substring(n-i, n-1)))
                return true;
            }
        }
        }
       
        return false;
    }
}