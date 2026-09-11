
class Solution {
    public int longestPalindromeSubseq(String s1) {
        // code here
       
        String s2 = new StringBuilder(s1).reverse().toString();
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(s1,s2,n,m,dp);
    }
    public int solve(String s1,String s2,int n,int m,int[][]dp){
        if(n==0||m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]= 1+ solve(s1,s2,n-1,m-1,dp);
        }
        else{
            return dp[n][m]= Math.max(solve(s1,s2,n-1,m,dp),solve(s1,s2,n,m-1,dp));
        }
    }
}