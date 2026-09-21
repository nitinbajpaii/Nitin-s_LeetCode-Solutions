class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(nums1,nums2,n,m,dp);
    }
    public int solve(int[]nums1,int nums2[],int n,int m,int[][] dp){
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
            return dp[n][m] = Math.max(solve(nums1,nums2,n-1,m,dp),solve(nums1,nums2,n,m-1,dp));
        }
    }
}