class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][] dup = new int[n][n];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
        {
            dup[j][n-1-i] = matrix[i][j];
        }
        }
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
        {
           matrix[i][j]=dup[i][j];
        }
        }
    }
}