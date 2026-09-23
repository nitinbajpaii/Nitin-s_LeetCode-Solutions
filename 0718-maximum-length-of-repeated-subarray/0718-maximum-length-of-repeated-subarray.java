class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n+1][m+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        int ans =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                ans = Math.max(ans,solve(nums1,nums2,i,j,dp));
            }
        }
        return ans;
    }
    public int solve(int[] nums1,int[]nums2,int n,int m,int[][]dp){
        if(n==0||m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(nums1[n-1]==nums2[m-1]){
            return dp[n][m] = 1+ solve(nums1,nums2,n-1,m-1,dp);
        }
        else{
            return dp[n][m]=0;
        }
    }
}