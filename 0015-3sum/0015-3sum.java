class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
       Arrays.sort(nums);
        int n = nums.length;
        for(int i =0;i<n;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
            continue;
          int j = i+1;
          int k = n-1; 
          while(j<k)
          {

            int s = nums[i]+nums[j]+nums[k];
            if(s<0)
            {
               j++;
            }
            else if(s>0)
            {
                k--;
            }
            else
            {
                 List<Integer> in = new ArrayList<>();
                  Collections.addAll(in, nums[i], nums[j], nums[k]);
                   out.add(in);
                  j++;
                  k--;
                  while(j<k&&nums[j]==nums[j-1])
                  {
                    j++;
                  }
                   while(j<k&&nums[k]==nums[k+1])
                  {
                    k--;
                  }
            }
          }
         
        }
        return out;
    }
}