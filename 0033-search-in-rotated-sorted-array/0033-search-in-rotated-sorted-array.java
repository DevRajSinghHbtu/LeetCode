class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = pivotfind(nums);

        // If array is not rotated
        if (pivot == -1) {
            return binarysearch(nums, target, 0, n - 1);
        }

        // If pivot element is target
        if (nums[pivot] == target) return pivot;

        // Search in left sorted part
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }

        // Otherwise search in right sorted part
        return binarysearch(nums, target, pivot + 1, n - 1);
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

    int binarysearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
}