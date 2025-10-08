class Solution {
    public int[] searchRange(int[] nums, int target) {
       
       int start = search(nums, target, true);
       int end = search(nums, target, false);
       int [] ans = {start, end};
       return ans;
    }
    int search(int[] nums, int target, boolean wheretogo)
    {
        int ans = -1;
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(nums[mid]>target)
            {
                e = mid-1;
            }
           else if(nums[mid]<target)
           {
            s = mid +1;
           }
           else
           {
            ans = mid;
            if(wheretogo)
            {
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }
           }
        }
        return ans;
    }
}