class Solution {
    public String removeKdigits(String num, int k) {
       
        Stack<Character> st = new Stack<>();
        int n = num.length();
        int i = 0;
         
        while(i<n)
        {
            while(!st.isEmpty() && k > 0 && st.peek() > num.charAt(i))
            {
                st.pop();
                k--;
                
            }
             st.push(num.charAt(i));
           
            i++;
        }
        while(k>0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }
        String ans = "";
      while(!st.isEmpty())
      {
         ans = ans + st.pop();
      }
      String reversed = new StringBuilder(ans).reverse().toString();
      ans = reversed;
      while(ans.length() > 1 && ans.charAt(0) == '0' )
      {
        ans = ans.substring(1);
      }
      if(ans.length()==0) return "0";
      return ans;
    }
}