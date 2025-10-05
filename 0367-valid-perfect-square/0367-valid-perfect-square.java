class Solution {
    public boolean isPerfectSquare(int num) {
        double x = Math.sqrt(num);
        if(num%x==0)
        return true;
        else
        return false;

    }
}