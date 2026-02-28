class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k-1);
    }
    int helper(int[] nums, int k)
    {
        int count = 0;
        int r = 0;
        int l = 0;
            Map<Integer, Integer> freq = new HashMap<>();
           while(r<nums.length){
             freq.put(nums[r], freq.getOrDefault(nums[r], 0)+1);
             while(freq.size()>k){
                int d = nums[l];
                freq.put(d, freq.get(d) - 1);
                if(freq.get(d) == 0)
                freq.remove(d);
                l++;
             }
             count += r-l+1;
             r++;
           }
        return count;
    }
}