class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int x = 0;
        if(nums.length==1)
        {
            return nums[0];
        }
        else
        {
           
        for(int i = 0;i<nums.length-1;i = i+2)
        {
            if(nums[i] != nums[i+1])
            {
               return nums[i];
            }
           
        }
          if(nums[nums.length-1] != nums[nums.length-2])
          {
            return nums[nums.length-1];
          }
        }

        return -1;
    }
}