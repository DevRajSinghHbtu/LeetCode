class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor)
        return 1;
        boolean sign = true;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
        {
            sign = false;
        }
           long n = Math.abs((long)dividend);
           long r = Math.abs((long)divisor);
           long ans = 0;
          while(n >= r)
          {
            int c = 0;
            while(n >= (r << (c+1)))
            {
                c++;
            }
            ans = ans + (1l << c);
            n = n - (r << c);
          } 
         if(ans >= Math.pow(2, 31) && sign == true) 
         { 
            return Integer.MAX_VALUE; 
            }
             if((ans >= Math.pow(2, 31)) && sign == false)
              {
                 return Integer.MIN_VALUE; 
                 }
        if(sign == true)
        return (int)ans;
        return (int)-ans;
    }
}