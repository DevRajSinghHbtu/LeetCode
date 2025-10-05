class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> out = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
             if(i>0&&nums[i]==nums[i-1])
            continue;
            for(int j = i+1;j<n;j++)
            {
                 if(j>i+1&&nums[j]==nums[j-1])
            continue;
            int k = j+1;
            int l = n-1;
            while(k<l)
            {
               long s = (long)nums[i] + nums[j] + nums[k] + nums[l];
               if(s<target)
               {
                k++;
               }
               else if(s>target)
               {
                l--;
               }
               else
               {
                List<Integer> in = new ArrayList<>();
                Collections.addAll(in, nums[i], nums[j], nums[k], nums[l]);
                out.add(in);
                k++;
                l--;
                while(k<l&&nums[k]==nums[k-1])
                {
                    k++;
                }
                while(k<l&&nums[l]==nums[l+1])
                {
                    l--;
                }
               }
            }
            }
        }
        return out;
    }
}