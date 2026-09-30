class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int m = cuts.length;
        int[] arr = new int[m+2];
        arr[0] = 0;
        arr[m+1] = n;
        for(int i=0;i<m;i++){
            arr[i+1] = cuts[i];
        }
        int[][] dp = new int[m+2][m+2];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return solve(arr,0,m+1,dp);

    }
    public int solve(int[] arr,int i,int j,int[][]dp){
        if(i+1==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int ans = solve(arr,i,k,dp) + solve(arr,k,j,dp) + (arr[j]-arr[i]);
            min = Math.min(ans,min);
        }
        return dp[i][j]=min;
    }
}