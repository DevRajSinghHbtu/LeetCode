class Solution {
    public int maxDistance(int[] colors) {
        int fi = 0;
        int li = colors.length-1;
        int ans = 0;
        for(int i = colors.length-1;i>0;i--)
        {
            if(colors[fi]!=colors[i]||colors[li]!=colors[i])
            {
                ans = Math.max(Math.max((li-i),(i-fi)), ans);
            }
        }
        return ans;
      
    }
}

