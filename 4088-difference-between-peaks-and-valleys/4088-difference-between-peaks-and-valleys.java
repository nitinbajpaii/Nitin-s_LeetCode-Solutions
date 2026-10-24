class Solution {
    public int peakValleyDifference(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                arr1.add(nums[i]);
            }
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                arr2.add(nums[i]);
            }
        }
        int sum1=0;
        for(int x: arr1){
            sum1 +=x;
        }
        int sum2=0;
        for(int x: arr2){
            sum2 += x;
        }
        return sum1-sum2;
        
    }
}