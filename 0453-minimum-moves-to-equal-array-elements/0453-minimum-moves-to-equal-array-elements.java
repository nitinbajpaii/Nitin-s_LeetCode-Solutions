class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int x:nums){
            if(x<min){
                min = x;
            }
        }
        int moves=0;
        for(int x: nums){
            moves += x-min;
        }
        return moves;
    }
}