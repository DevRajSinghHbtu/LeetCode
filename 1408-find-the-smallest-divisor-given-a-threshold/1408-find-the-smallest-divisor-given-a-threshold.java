class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       // int min = 0;
        int max = 0;
        for(int num : nums)
        {
          //  min = Math.min(num, min);
            max = Math.max(num, max);
        }
        int s = 1;
        int e = max;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int sum = divisorsum(nums, mid);
            if(sum<=threshold)
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
    int divisorsum(int a[], int d)
    {
        int sum = 0;
        for(int i : a)
        {
           sum = sum + (int)Math.ceil((double)i/d);
        }
        return sum;
    }
}