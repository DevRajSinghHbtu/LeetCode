class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        ans.add(new ArrayList<>());
         int start = 0;
         int end = 0;
        for(int i = 0; i<nums.length; i++)
        {
            start = 0;
            if(i>0 && nums[i]==nums[i-1])
            {
                start = end + 1;
            }
            end = ans.size() - 1;
            int n = ans.size();
            for(int j = start; j<n; j++)
            {
                 List<Integer> ds = new ArrayList<>(ans.get(j));
                 ds.add(nums[i]);
                 
                   ans.add(ds);
            }
            
        }
        return ans;
    }
}