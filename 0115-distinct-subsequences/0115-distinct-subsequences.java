class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n+1][m+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return lcs(s,t,n,m,dp);
    }
    public int lcs(String s1,String s2,int n,int m,int[][]dp){
        if(m==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m] = lcs(s1,s2,n-1,m-1,dp) + lcs(s1,s2,n-1,m,dp);
        }
        else{
            return dp[n][m] = lcs(s1,s2,n-1,m,dp);
        }
    }
}