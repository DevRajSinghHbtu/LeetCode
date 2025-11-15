class Solution {
    public int splitArray(int[] nums, int k) {
        int min = 0;
        int max = 0;
        for(int num :nums)
        {
            min = Math.max(min, num);
            max = max + num;
        }
        int s = min;
        int e = max;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int noOfsplits = numbersSplits(nums, mid);
            if(noOfsplits <= k)
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
    int numbersSplits(int [] nums, int minsum)
    {
        int splits = 1;
        int splitsum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(splitsum + nums[i] <= minsum)
            {
                splitsum = splitsum + nums[i];
            }
            else
            {
                splitsum = nums[i];
                splits++;
            }
        }
        return splits;
    }
}