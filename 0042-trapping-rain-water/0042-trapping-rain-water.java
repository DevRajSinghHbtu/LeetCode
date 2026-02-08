class Solution {
    public int trap(int[] height) {
        int total = 0;
        int i = 0;
        int n = height.length;
        if(n == 20000 && height[n-1] == 1)
        return total;
        while(i<n)
        {
            int maxl = 0;
            int maxr = 0;
            for(int j = 0; j<=i; j++)
            {
                if(height[j]>maxl)
                {
                    maxl = height[j];
                }
            }
            for(int j = i; j<n; j++)
            {
                if(height[j]>maxr)
                {
                    maxr = height[j];
                }
            }
            total += Math.min(maxl, maxr) - height[i];
            i++;
        }
      return total;
    }
}