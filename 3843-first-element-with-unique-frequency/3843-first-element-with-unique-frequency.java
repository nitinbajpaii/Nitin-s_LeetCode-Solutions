class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x: map.keySet()){
            freq.put(map.get(x),freq.getOrDefault(map.get(x),0)+1);
        }
        for(int x: nums){
            if(freq.get(map.get(x))==1){
                return x;
            }
        }
        return -1;
    }
}