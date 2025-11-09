class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int min = Integer.MIN_VALUE;
       int max = 0;
        for(int weight : weights)
        {
            min = Math.max(min, weight);
            max = max + weight;
        }
        int s = min;
        int e = max;
        
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int numOfDays = findDays(weights, mid);
            if(numOfDays <= days)
            {
                e = mid - 1;
            }
             else
            {
                s = mid + 1;
            }
        }
        return s;
    }
    int findDays(int a [], int w)
    {
        int days = 1;
        int sumweight = 0;
       for(int i : a)
       {
        if(sumweight + i > w)
        {
            days ++;
            sumweight = i;
        }
        else
        {
            sumweight = sumweight + i;
        }
       }
        return days;
    }
}