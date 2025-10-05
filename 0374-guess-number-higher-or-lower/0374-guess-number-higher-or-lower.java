/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1;
        
       
        while(s<=n){

         int num = s + (n-s)/2;
          int a = guess(num);
        if(a==-1)
        {
            n = num-1;
        }
        else if(a==1)
        {
            s = num+1;
        }
        else if(a==0)
        {
            return num;
        }
        }
        return -1;
    }
}