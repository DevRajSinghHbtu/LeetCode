class Solution {
    public int maximumWealth(int[][] accounts) {
        int x, y;int max=0;
       
        for(x=0;x<accounts.length;x++)
        {
            int sum = 0;
            for(y=0;y<accounts[x].length;y++)
            {
              sum = sum+accounts[x][y];
            }
            if(max<sum)
            {
                max = sum;
            }
        }
        return max;
    }
}