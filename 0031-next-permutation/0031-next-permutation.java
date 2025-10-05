class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for(int x = n-2;x>=0;x--)
        {
            if(nums[x]<nums[x+1])
            {
                ind = x;
                //swap(nums, x, x+1);
                break;
                }
        }
            if(ind==-1)
        {
            Arrays.sort(nums);
            return;
           // reverse(nums, 0, n-1);
        }
           for(int i = n-1;i>=0;i--)
           {
             if(nums[ind]<nums[i])
             {
                swap(nums, i, ind);
                break;
                
             }
           }
        
        reverse(nums, ind+1, n-1);

    }
    static void swap(int arr[], int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    static void reverse(int arr[], int s, int e) {
        while (s < e) {
            swap(arr, s, e);
            s++;
            e--;
        }
    }
}