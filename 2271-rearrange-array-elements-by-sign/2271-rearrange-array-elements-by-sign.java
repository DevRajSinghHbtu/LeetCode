class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int neg[] = new int[n/2];
        int pos[] = new int[n/2];
       int p = 0;int q = 0;
        for(int i = 0; i<n;i++)
        {
           if(nums[i]>0)
           {
            pos[p++] = nums[i];
           }
           else{
            neg[q++] = nums[i];
           }
        }
        for(int j = 0;j<n/2;j++)
        {
            nums[2*j] = pos[j];
            nums[(2*j)+1] = neg[j];
        }
        return nums;
    }
}