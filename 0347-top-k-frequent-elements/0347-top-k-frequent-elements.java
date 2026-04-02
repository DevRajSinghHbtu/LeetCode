class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

       int[] ans = new int[k];
        for(int i = 1; i<=k; i++){
           int maxElement = Collections.max(mp.entrySet(), 
             Map.Entry.comparingByValue()).getKey();
            ans[i-1] = maxElement;
            mp.remove(maxElement);
        }
       
       return ans;
    }
}