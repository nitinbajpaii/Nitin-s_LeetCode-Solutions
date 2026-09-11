class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a++;
            }
            else{
                b++;
            }
        }
        if(a==b){
            return 0;
        }
        if(b==0){
            return a;
        }
        if(a==0){
            return b;
        }
        else{
            return Math.abs(a-b);
        }
    }
}