class Solution {
    public int findDuplicate(int[] nums) {
     cyclicsort(nums);
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            return nums[i];
        }
        return -1;
    }
    static void sort(int[] arr, int first, int second)
    {
        
       int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cyclicsort(int [] arr)
    {
        int i = 0;
        while (i<arr.length) {
            if(arr[arr[i]-1]!=arr[i])
            {
            if(arr[i]!=i+1)
            {
                sort(arr, i, arr[i]-1);
            }
            else{
                i++;
            }
        }
        else{
            i++;
        }
    }
    }   
    
}