class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       if(bloomDay.length >= (long)m*k)
       {
        int min = Integer.MAX_VALUE;;
        int max =Integer.MIN_VALUE;
        for(int i : bloomDay)
        {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int s = min;
        int e = max;
        
        while(s<=e)
        {
           int mid = s + (e-s)/2;
           if(possible(bloomDay, mid, m, k))
           {
            e = mid-1;
           }
           else
           {
            s = mid + 1;
           }
        }
        return s;
       }
       else
       {
        return -1;
       }
      
    }
      boolean possible(int [] a, int l, int m, int k)
      {
        int count = 0;
        int bouq = 0;
        
        for(int i = 0; i<a.length; i++)
        {
            if(a[i]<=l)
            {
                count++;
            }
            else
            {
                bouq = bouq + (count/k);
                count = 0;
            }
        }
        bouq = bouq + (count/k);
        if(bouq >= m)
        return true;
        return false;
        

      }
}