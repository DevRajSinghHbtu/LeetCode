class Solution {
    public List<String> letterCombinations(String digits) {
        return helper("", digits);
    }
    public List<String> helper(String p, String up)
    {
           
          if(up.isEmpty())
          {
            List<String> base = new ArrayList<>(); 
             base.add(p);
             return base;
          }
          List<String> ans = new ArrayList<>();
          int ch = up.charAt(0) - '0';
          if(ch != 7 && ch != 9 && ch != 8)
          {
            for(int i = 3*(ch-2); i<= (3*(ch - 1)-1); i++)
          {
            char c = (char)('a' + i);
            ans.addAll(helper(p + c, up.substring(1)));
          }
          }
          else if(ch == 7)
          {
            for(int i = 15; i<= 18; i++)
          {
            char c = (char)('a' + i);
            ans.addAll(helper(p + c, up.substring(1)));
          }
          }
          else if(ch == 9)
          {
            for(int i = 22; i<= 25; i++)
          {
            char c = (char)('a' + i);
            ans.addAll(helper(p + c, up.substring(1)));
          }
          }
          else
          {
            for(int i = 19; i<= 21; i++)
          {
            char c = (char)('a' + i);
            ans.addAll(helper(p + c, up.substring(1)));
          }
          }
          
        return ans;
    }
}