class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int countone = 0;
       for(int i = 0;i<nums.length;i++)
       { 
        if(nums[i]==1)
            {countone++;
            }
            
            else
            {countone =0;
            }
           
            
        
      max = Math.max(max, countone);
       }
       return max;
    }
}