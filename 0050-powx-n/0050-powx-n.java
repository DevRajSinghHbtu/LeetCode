class Solution {
    public double myPow(double x, int n) {
      if(n < 0)
      {
        n = -1*n;
        return 1/helper(x, n);
      }
      else
      return helper(x, n);
    }
    double helper(double x, int n)
    {
        if(n == 0)
        return 1;
        else
       {
        double half = helper(x, n/2);

        if(n%2 == 0)
        return half*half;
        else
        return half*half*x;
       }
    }
}