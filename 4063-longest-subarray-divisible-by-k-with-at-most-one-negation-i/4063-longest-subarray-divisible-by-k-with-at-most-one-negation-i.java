class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int ans =0;
        for(int i=0;i<n;i++){
            int sum=0;
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){
                sum += nums[j];
                int rem = ((2*nums[j])%k+k)%k;
                set.add(rem);

                if(sum%k==0){
                    ans = Math.max(ans,j-i+1);
                }

                int need = ((sum%k)+k)%k;
                if(set.contains(need)){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}