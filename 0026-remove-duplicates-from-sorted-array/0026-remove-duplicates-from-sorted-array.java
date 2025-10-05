class Solution {
    public int removeDuplicates(int[] nums) {
      
    ArrayList<Integer> li = new ArrayList<>();
    int n = nums.length;

    // Add only unique elements
    for (int i = 0; i < n; i++) {
        if (!li.contains(nums[i])) {  // check if already present
            li.add(nums[i]);
        }
    }

    int k = li.size();  // number of unique elements

    // Copy unique elements back into nums
    for (int j = 0; j < k; j++) {
        nums[j] = li.get(j);
    }

    return k;
}

    }
