class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}