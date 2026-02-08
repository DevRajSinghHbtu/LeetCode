class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        
        int i = 0;
        int[] ans = new int[nums.length];

        while(i<nums.length)
        {
            boolean flag = false;
           for(int j = i+1; j<nums.length; j++)
           {
               if(nums[i]<nums[j])
               {
                ans[i] = nums[j];
                flag = true;
                break;
               }
           }
           if(!flag && i>0)
           {
            for(int j = 0;j<=i-1; j++)
            {
                 if(nums[i]<nums[j])
               {
                ans[i] = nums[j];
                flag = true;
                break;
               }
            }
           }
           if(!flag)
           {
               ans[i] = -1;
           }
          
           i++;
        } 
        return ans;   
    }
}