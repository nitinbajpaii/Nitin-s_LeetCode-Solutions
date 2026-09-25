class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+2];
        arr[0]=1;
        arr[n+1]=1;
        for(int i=0;i<n;i++){
            arr[i+1] =  nums[i];
        }
        int[][] dp = new int[n+2][n+2];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return solve(arr,0,n+1,dp);

    }
    public int solve(int[] arr,int i,int j,int[][]dp){
        if(i+1==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = Integer.MIN_VALUE;

        for(int k=i+1;k<j;k++){
            int current = solve(arr,i,k,dp)+ solve(arr,k,j,dp)+ arr[i]*arr[j]*arr[k];
            ans = Math.max(ans,current);
        }
        return dp[i][j] = ans;
    }
}