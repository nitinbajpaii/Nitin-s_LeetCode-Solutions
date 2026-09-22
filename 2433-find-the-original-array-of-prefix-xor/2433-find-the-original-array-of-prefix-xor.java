class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] ans = new int[n];
        int xor = 0;
        for(int i=0;i<n;i++){
            xor ^= pref[i];
            ans[i]  = xor;
            xor = pref[i];
        }
        return ans;
    }
}