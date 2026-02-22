class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1)
        return nums;
       int l = 0;
       int r = k-1;
       int max = Integer.MIN_VALUE;
       int mi = -1;

       for(int i = l; i<=r; i++)
       {
        if(max <= nums[i])
        {
            max = nums[i];
            mi = i;
        }
       } 
       
       int n = nums.length;
      int[] a = new int[n-(k-1)];
      int i = 0;
    while(r<n)
    {
          a[i++] = max;
            l++;
            r++;

            if (r >= n) break;

        if(max < nums[r] && mi >= l)
        {
            mi = r;
            max = nums[r];
        }
        else if(mi < l)
        {
            max = Integer.MIN_VALUE;
            for(int j = l; j<=r; j++)
            {
                if(max <= nums[j])
                 {
                    max = nums[j];
                    mi = j;
                 }
            }
        }
    
        
     
    }
     
        return a;
    }
}