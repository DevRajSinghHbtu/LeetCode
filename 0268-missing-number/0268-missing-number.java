class Solution {
    public int missingNumber(int[] nums) {
        cyclicsort(nums);
        return missingnum(nums);
    }
     static void cyclicsort(int [] arr)
    {
        int i = 0;
        while (i<arr.length) {
           if(arr[i]==arr.length)
           {
              i++;
           }
           
            else if(arr[i]!=i)
            {
                sort(arr, i, arr[i]);
            }
            else{
                i++;
            }
            
        }
    }
     static void sort(int[] arr, int first, int second)
    {
        
       int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
     static int missingnum(int [] arr)
    {
        int i =0;
        while(i<arr.length)
        {
            if(arr[i]!=i)
            return i;
            else
            i++;
        }
        return arr.length;
    }
}