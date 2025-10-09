class Solution {
    public int findMin(int[] nums) {
       int pivot = pivotfind(nums);
       if(pivot==-1)
       {
        return nums[0];
       } 
       else
       {
        return nums[pivot+1];
       }
    }
    int pivotfind(int[] ar) {
        int s = 0;
        int e = ar.length - 1;

        // Handle already sorted case
        if (ar[s] < ar[e]) return -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Check if mid is pivot
            if (mid < e && ar[mid] > ar[mid + 1]) return mid;
            if (mid > s && ar[mid] < ar[mid - 1]) return mid - 1;

            // Decide which side to go
            if (ar[mid] >= ar[s]) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
}