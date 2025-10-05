class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = linear(candies);
         List<Boolean>ans=new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                 ans.add(i,true);
            } else {
                ans.add(i,false);
            }
        }
       return ans;
    }

    static int linear(int[] candies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        return max;
    }

}