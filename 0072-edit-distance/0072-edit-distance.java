class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return solve(word1,word2,n,m,dp);
    }
    public int solve(String word1,String word2,int n,int m,int[][]dp){
        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(word1.charAt(n-1)==word2.charAt(m-1)){
            return dp[n][m]= solve(word1,word2,n-1,m-1,dp);
        }
        int insert = solve(word1,word2,n,m-1,dp);
        int delete = solve(word1,word2,n-1,m,dp);
        int replace = solve(word1,word2,n-1,m-1,dp);
        return dp[n][m] = 1+ Math.min(insert,Math.min(delete,replace));
    }
}