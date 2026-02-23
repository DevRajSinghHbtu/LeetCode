class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen = 0;
       for(int i = 0; i<nums.length; i++)
       {
        int zeros = 0;
        for(int j = i; j<nums.length; j++)
        {
            if(nums[j] == 0)
            {
                zeros++;
            }
            if(zeros > k)
            {
                break;
            }
            if(zeros <= k)
            {
                maxlen = Math.max(maxlen, j-i+1);
            }
        }
       }
       return maxlen;
    }
}