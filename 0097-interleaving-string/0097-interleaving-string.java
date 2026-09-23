class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        if(n+m!=s3.length()){
            return false;
        }
        int[][] dp = new int[n+1][m+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return solve(s1,s2,s3,n,m,dp);
    }
    public boolean solve(String s1,String s2,String s3,int n,int m,int[][] dp){
        if(n==0&&m==0){
            return true;
        }
        if(dp[n][m]!=-1){
            return dp[n][m]==1;
        }
        int i= n+m;
        boolean takeS1 = false;
        boolean takeS2 = false;
        if(n>0 && s1.charAt(n-1)==s3.charAt(i-1)){
            takeS1 = solve(s1,s2,s3,n-1,m,dp);
        }
        if(m>0 && s2.charAt(m-1)==s3.charAt(i-1)){
            takeS2 = solve(s1,s2,s3,n,m-1,dp);
        }
        boolean ans = takeS1 || takeS2;
        dp[n][m] = ans ? 1:0;
        return ans;
    }
}