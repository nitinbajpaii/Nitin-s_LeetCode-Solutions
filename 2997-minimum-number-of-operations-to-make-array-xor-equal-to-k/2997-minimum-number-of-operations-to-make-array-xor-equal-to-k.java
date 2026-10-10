class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=0;
        for(int x: nums){
            xor ^= x;
        }
        xor ^= k;
        int count=0;
        while(xor!=0){
            xor = xor & (xor-1);
            count++;
        }
        return count;
    }
}