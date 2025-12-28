class Solution {
    public boolean isHappy(int n) {
        if(n == 1 || n == 10 || n == 100 || n == 1000)
        return true;
        int fast = findSquare(findSquare(n));
        int slow = findSquare(n);
        while(fast != slow)
        {
            fast = findSquare(findSquare(fast));
            slow = findSquare(slow);
            if(slow == 1)
            return true;
        }
        return false;
       
    }
    public int findSquare(int number)
    {
        int rev = 0;
        while(number > 0)
        {
           int d = number % 10;
            rev += d*d;
            number /= 10;
        }
        return rev;
    }
}