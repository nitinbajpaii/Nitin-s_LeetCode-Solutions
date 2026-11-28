class Solution {
    public int largestInteger(int n, int s) {
        if(s==0){
            return 0;
        }
        if(s > 9*n){
            return -1;
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            int digit = Math.min(9,s);
            ans = ans * 10 + digit;
            s -= digit;
        }
        return ans;
    }
}