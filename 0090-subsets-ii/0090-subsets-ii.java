class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        ans.add(new ArrayList<>());
        for(int num : nums)
        {
            int n = ans.size();
            for(int i = 0; i<n; i++)
            {
                 List<Integer> ds = new ArrayList<>(ans.get(i));
                 ds.add(num);
                 if(!ans.contains(ds))
                   ans.add(ds);
            }
            
        }
        return ans;
    }
}