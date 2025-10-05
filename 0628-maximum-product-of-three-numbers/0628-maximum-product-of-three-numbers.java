class Solution {
    public int maximumProduct(int[] nums)
     {
        Arrays.sort(nums); // Sort the array

        int n = nums.length;

        // Option 1: product of the three largest numbers
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Option 2: product of two smallest and the largest number
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}