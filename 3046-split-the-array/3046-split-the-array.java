class Solution {
    public boolean isPossibleToSplit(int[] nums) {
      //  ArrayList <Integer> list = new ArrayList <Integer>();
        //int n = nums.length();
        //for(int i = 0; i<n;i++)
        //{
          //  if(!list.contain(nums[i]))
            //{
              //  list.add[nums[i]];
            //}
        //}
        //int na = list.size();
        //int dup = n - na;
        int n = nums.length;
        
      for(int i = 0; i<n;i++)
      {
        int ouc = 1;
          for(int j = i+1;j<n;j++)
          {
            if(nums[i]==nums[j])
            {
                ouc++;
            }

          }
          if(ouc>=3)
          return false;
      }
      return true;
    }
}