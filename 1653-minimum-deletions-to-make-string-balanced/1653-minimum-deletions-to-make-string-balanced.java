class Solution {
    public int minimumDeletions(String s) {
        int res=0;
        int count=0;
        for(char c: s.toCharArray()){
            if(c=='b'){
                count++;
            }
            else if(count!=0){
                count--;
                res++;
            }
        }
        return res;
    }
}