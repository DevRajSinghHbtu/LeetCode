class Solution {
    public int candy(int[] ratings) {
       int n = ratings.length;
       int[] candies = new int[n];
       Arrays.fill(candies, 1);
       boolean check = true;
       while(check){
        check = false;
        for(int i = 1; i<n; i++){
            if(ratings[i]>ratings[i-1] && candies[i] <= candies[i-1]){
                candies[i] = candies[i-1] +1;
                check = true;
            }
        }
        for(int i = n-2; i>=0; i--){
            if(ratings[i]>ratings[i+1] && candies[i] <= candies[i+1]){
                candies[i] = candies[i+1] +1;
                check = true;
            }
        }
       }
       int total = 0;
       for(int t : candies){
        total += t;
       }
       return total;
    }
}