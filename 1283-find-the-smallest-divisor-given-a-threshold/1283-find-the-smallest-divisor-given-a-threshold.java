class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        Arrays.sort(nums);
        int left=1;
        int right = nums[n-1];
        int ans = 0;
        while(left<=right){
            int mid = left+(right-left)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                sum += Math.ceil((double)nums[i]/mid);
            }
            if(sum<=threshold){
                right = mid-1;
                ans=mid;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}