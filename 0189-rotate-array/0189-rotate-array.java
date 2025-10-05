class Solution {
   
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k = k % n;
        int [] a = new int[k];
        int [] b = new int[n-k];

        int j = 0;
        for(int i = n-k; i<n; i++)
        {
           a[j++] = nums[i];
        }
        for(int l = 0; l<n-k; l++)
        {
           b[l] = nums[l];
        }
          
          for(int c = 0;c<k;c++)
          {
            nums[c] = a[c];
          }
          int q = 0;
          for(int d = k; d<n;d++)
          {
            nums[d] = b[q++];
          }
      

}
}