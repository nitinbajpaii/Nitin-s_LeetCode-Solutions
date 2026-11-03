class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int x: nums){
            if(x>max){
                max=x;
            }
        }
        int moves =0;
        for(int x: nums){
            moves += max-x;
        }
        return moves;
    }
}