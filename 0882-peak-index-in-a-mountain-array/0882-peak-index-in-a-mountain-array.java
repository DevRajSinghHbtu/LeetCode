class Solution {
      public static void main(String[] args) {

    }

    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid-1]>arr[mid])
            {
                e = mid;
            }
            else 
            {
            s = mid;
            }
        }
        return -1;
    }
}