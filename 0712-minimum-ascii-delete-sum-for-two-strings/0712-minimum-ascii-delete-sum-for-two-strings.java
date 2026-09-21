class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return solve(s1,s2,n,m,dp);
    }
    public int solve(String s1,String s2,int n,int m,int[][]dp){
        if(n==0){
            int sum=0;
            for(int i=0;i<m;i++){
                sum += s2.charAt(i);
            }
            return sum;
        }
        if(m==0){
            int sum=0;
            for(int i=0;i<n;i++){
                sum += s1.charAt(i);
            }
            return sum;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m] = solve(s1,s2,n-1,m-1,dp);
        }
        else{
            int deleteS1 = s1.charAt(n-1) + solve(s1,s2,n-1,m,dp);
            int deleteS2 = s2.charAt(m-1) + solve(s1,s2,n,m-1,dp);
            return dp[n][m] = Math.min(deleteS1,deleteS2);
        }
    }
}