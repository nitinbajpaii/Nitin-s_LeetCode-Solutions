class Solution {
    public boolean canTransform(int[] source, int[] target) {
        int n = source.length;
        int m = target.length;
        if(n!=m){
            return false;
        }
        long sum1=0;
        long sum2=0;
        for(int x: source){
            sum1 += x;
        }
        for(int x: target){
            sum2 += x;
        }
        return sum1==sum2;
    }
}