class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        Integer[][] dp = new Integer[n][m];
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            ans = Math.min(ans,solve(matrix,n-1,j,n,m,dp));
        }
        return ans;  
    }
    public int solve(int[][] matrix,int i,int j,int n,int m,Integer[][]dp){
        if(j<0 || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i==0){
            return dp[i][j] = matrix[i][j];
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int s = solve(matrix,i-1,j,n,m,dp);
        int ld = solve(matrix,i-1,j-1,n,m,dp);
        int rd = solve(matrix,i-1,j+1,n,m,dp);
        return dp[i][j] = Math.min(s,Math.min(ld,rd))+ matrix[i][j];
    }
}