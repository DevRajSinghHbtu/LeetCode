import java.io.*;
import java.util.Scanner;
class Solution {
  
   public int reverse(int x) {
        String s = ""; 
        int q = x;
        String nu = Integer.toString(q);
        char fc = nu.charAt(0);
       if(x!=0 && x>=Math.pow(-2,31) && x<=(Math.pow(2,31) - 1))
       {
        while(x!=0)
        
        {

            String num = Integer.toString(x);
            int l = num.length();
            
            char c = num.charAt(l-1);
            s = s + c;
            x = x/10;
        }
      
       if(fc == '-')
       {
        s = fc + s;
        long p = Long.parseLong(s);
         if(p>=Math.pow(-2,31) && p<=(Math.pow(2,31) - 1))
        return (int)p;
        else
        return 0;
       }
         long p = Long.parseLong(s);
        if(p>=Math.pow(-2,31) && p<=(Math.pow(2,31) - 1))
        return (int)p;
        else
        return 0;
       } 
        return 0;
    }
}