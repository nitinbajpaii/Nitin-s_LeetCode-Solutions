class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n+1][n+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        int i=0;
        int j = n-1;
        return solve(values,i,j,dp);
    }
    public int solve(int[] values,int i,int j,int[][]dp){
        if(i+1==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int cost = solve(values,i,k,dp) + solve(values,k,j,dp) + values[i]*values[j]*values[k];
            ans = Math.min(ans,cost);
        }
        return dp[i][j]=ans;
    }
}