class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int lcs =  solve(word1,word2,n,m,dp);
        return n+m - 2*lcs;
        
    }
    public int solve(String word1,String word2,int n,int m,int[][]dp){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(word1.charAt(n-1)==word2.charAt(m-1)){
            return dp[n][m]=1+ solve(word1,word2,n-1,m-1,dp);
        }
        else{
            return dp[n][m]= Math.max(solve(word1,word2,n-1,m,dp),solve(word1,word2,n,m-1,dp));
        }
    }
}