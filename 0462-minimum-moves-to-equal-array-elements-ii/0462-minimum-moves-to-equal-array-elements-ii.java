class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int moves=0;
        for(int x: nums){
            moves += Math.abs(x-median);
        }
        return moves;
    }
}