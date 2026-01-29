class Solution {
    public int countPrimes(int n) {
        int[] a = new int[n];
        for(int i = 2; i<n; i++)
        {
            a[i] = 1;
        }
        int c = 0;
        for(int i = 2; i<n; i++)
        {
            if(a[i]==1)
            {
                c++;
                for(int j = 2*i; j<n; j += i)
                {
                    a[j] = 0;
                }
            }
        }
     return c;
 }
}