class Solution {
    public boolean isPowerOfTwo(double n) {
        if(n == 1)
        {
            return true;
        }
        if(n<1)
        {
            return false;
        }
        else 
        {
            return isPowerOfTwo(n/2);
        }
    }
}