class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int x: nums){
            if(x>=0){
                list.add(x);
            }
        }
        int n = list.size();
        if(n>0){
            k = k%n;
            Collections.rotate(list,-k);
        }
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i] =list.get(index++);
            }
        }
        return nums;
    }
}