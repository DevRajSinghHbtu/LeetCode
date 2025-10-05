class Solution {
    public boolean isPalindrome(int x) {
        int rev = checkpal(x);
        if(rev == x)
        {
            return true;
        }
        else
        return false;
    }
    int checkpal(int num)
    { 
        int s = 0;
        if(num>0)
        {
        while(num!=0)
        {
          int dig = num%10;
          s = (s*10) + dig;
          num = num/10;
        }
        return s;
        }
        return 0;
    }
}