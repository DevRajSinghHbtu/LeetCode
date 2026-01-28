class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> outer = new ArrayList<>();
         int sub = (1<<nums.length);
         for(int num = 0; num < sub; num++)
         {
            List<Integer> inner = new ArrayList<>();
            for(int i = 0; i<nums.length; i++)
            {
                if((num & (1 << i)) != 0)
                {
                    inner.add(nums[i]);
                }
            }
            outer.add(inner);
         }
         return outer;
        
    }
}