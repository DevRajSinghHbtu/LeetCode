class Solution {
    public int search(int[] nums, int target) {
        
       
          return helper(nums, target, 0, nums.length-1);
    }
    int helper(int[] ar, int tar, int s, int e)
    {
        int mid =s + (e-s)/2;
         if(ar[mid]==tar)
       {
        return mid;
       }
       if(s<e)
       {
        if(ar[mid]>tar)
       {
        return helper(ar, tar, s, mid-1);
       }
       else if(ar[mid]<tar)
       {
        return helper(ar, tar, mid+1, e);
       }
       }
       
       return -1;
       }
      
    }
