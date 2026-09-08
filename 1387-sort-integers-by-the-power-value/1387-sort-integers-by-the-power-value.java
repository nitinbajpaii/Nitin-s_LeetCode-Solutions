class Solution {
    public int getKth(int lo, int hi, int k) {
        ArrayList<int[]> arr = new ArrayList<>();
        for(int i=lo;i<=hi;i++){
            int n =i;
            int count=0;
            while(n!=1){
                if(n%2==0){
                    n = n/2;  
                }
                else{
                    n = n * 3 + 1; 
                }
                count++;
            }
            arr.add(new int[] {i,count});
        }
        arr.sort((a,b)->{
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        return arr.get(k-1)[0];
    }
}