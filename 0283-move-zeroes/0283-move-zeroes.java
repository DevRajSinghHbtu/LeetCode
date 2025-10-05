class Solution {
    public void moveZeroes(int[] nums) {
           
    
        int c = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            if(nums[i]==0)
            {
               c++;
            }
        }
        if(c>0)
        {
            for(int i = 1;i<=c;i++)
            {
                for(int j = 0; j< n-i; j++)
                {
                    if(nums[j]==0)
                    {
                        swap(nums,j,j+1);
                    }
                }
            }
        }
    }
    static void swap(int arr[], int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s]= temp;
    }
    }
