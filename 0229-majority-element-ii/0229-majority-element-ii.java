class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int nu = (int)Math.floor(n/3);
        Arrays.sort(nums);
       
        for(int i = 0; i<n;i++)
        {
             int c = 0;
            for(int j = i;j<n;j++)
            {
               if(nums[i]==nums[j])
               {
                c++;
               }
            }
            if(c>nu)
            {
                 if (!list.contains(nums[i])) {
            list.add(nums[i]);
                 }
            }
        }
        return list;
    }
}