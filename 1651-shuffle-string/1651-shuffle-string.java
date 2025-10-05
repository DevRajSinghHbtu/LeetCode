class Solution {
    public String restoreString(String s, int[] indices) {
        String suf = "";
        for(int i = 0;i<=s.length()-1;i++)
        {
            for(int j = 0;j<=indices.length-1;j++)
            {
            if(i==indices[j])
            {
                suf = suf + s.charAt(j);
            }
            
            }
        }
        return suf;
    }
}