class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        long count=0;
        for(int num:nums){
            if(num>=minK && num<=maxK){
                count++;
                ans += count;
            }
            else{
                count=0;
            }
        }
        return ans;
    }
}