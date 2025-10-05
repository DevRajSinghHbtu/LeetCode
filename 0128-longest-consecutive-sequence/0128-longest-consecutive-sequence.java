class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longcons = 0;
        int count = 0;
        int lastsmall = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            if(nums[i]-1==lastsmall)
            {
                count++;
                lastsmall = nums[i];
            }
            else if(nums[i] != lastsmall)
            {
                count = 1;
                lastsmall = nums[i];
            }
            longcons = Math.max(longcons, count);
        }
       return longcons;
    }
}