import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String changenew = "";   
   
       String snew = s.toLowerCase();
       snew.trim();
       //System.out.println(snew);
      // return snew;
      changenew = snew.replaceAll("[^a-zA-Z0-9]", "");
      // return changenew;
       int l = changenew.length()-1;
     // String Unchangedold = changenew;
      String rev = "";
      for(int i = l; i>=0; i--)
      {
         rev = rev + changenew.charAt(i);
      }
      if(rev.equals(changenew))
      return true;
      else
      return false;
    }
    }
