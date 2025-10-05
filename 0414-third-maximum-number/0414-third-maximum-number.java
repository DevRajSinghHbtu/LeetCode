import java.util.ArrayList;
class Solution {
    public int thirdMax(int[] nums) {
       bubblesort(nums);
       ArrayList<Integer> list = new ArrayList<>();
      for(int i = 0;i<nums.length-1;i++) 
      {
        if(nums[i]!=nums[i+1])
        {
           list.add(nums[i]);
            if(i==nums.length-2)
            {
               list.add(nums[i+1]);
            }
        }
        else if((i==nums.length-2) && (nums[i]==nums[i+1]))
        {
            list.add(nums[i]);
        }
        
      }

      if(list.size()==0)
      {
        list.add(nums[0]);
      }
       
       if(list.size()>2)
       {
        return list.get(2);
       }
       else
       {
        return list.get(0);
       }
    }
      static void bubblesort(int[] arr)
    {
        boolean sorted = false;
        for(int i =0; i<arr.length; i++)
        {
            for(int j =1;j<arr.length-i;j++)
            {
              if(arr[j-1]<arr[j])
              {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                sorted = true;
              }
            }
            if(!sorted)
            break;
        }
    }
}