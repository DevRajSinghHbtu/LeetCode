class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int last = 0;
for (int pile : piles) 
{
    last = Math.max(last, pile);
}


       long s = 1;
       long e = last;
       long ans = -1;
       while(s<=e)
       {
        long mid  = s + (e-s)/2;
        if(minicount(piles, mid)<=h)
        {
            ans = mid;
            e = mid-1;
        }
        else
        {
            s = mid + 1;
        }
       }
        return (int)ans;
    }
    long minicount(int [] nums, long hour)
    {
        long takentime = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            takentime = takentime + (long)Math.ceil((double)nums[i]/hour);
        }
        return takentime;
    }
}