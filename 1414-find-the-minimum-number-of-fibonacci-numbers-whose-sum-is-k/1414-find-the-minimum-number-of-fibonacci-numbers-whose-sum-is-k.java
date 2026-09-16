class Solution {
    public int findMinFibonacciNumbers(int k) {
        if(k==1){
            return 1;
        }
        int f1=1,f2=1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        while(f2<k){
            int nx = f1+f2;
            f1=f2;
            f2=nx;
            list.add(nx);
        }
        int res=0;
        for(int i=list.size()-1;i>=0 && k>0;i--){
            if(list.get(i)<=k){
                k -= list.get(i);
                res++;
            }
        }
        return res;
    }
}