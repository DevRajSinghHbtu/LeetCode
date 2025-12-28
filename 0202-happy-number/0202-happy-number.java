class Solution {
    public boolean isHappy(int n) {
       int fast = n;
       int slow = n;
       do{
        fast = findSquare(findSquare(fast));
        slow = findSquare(slow);
        
       } while(fast != slow);
       if(slow == 1)
       return true;
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