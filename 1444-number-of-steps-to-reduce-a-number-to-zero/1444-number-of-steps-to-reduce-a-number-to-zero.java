class Solution {
     int ce = 0;
     int co = 0;
    public int numberOfSteps(int num) {
       int st = countstep(num);
       return st; 
    }
     int countstep(int n)
    {
        if(n==0)
        {
            return ce+co;
        }
        else if(n%2==0)
        {
            ce++;
            return countstep(n/2);
        }
        else
        {
            co++;
            return countstep(n-1);
        }
    }
}