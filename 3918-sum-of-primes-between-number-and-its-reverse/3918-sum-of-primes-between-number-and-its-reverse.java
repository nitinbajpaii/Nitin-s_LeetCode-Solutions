class Solution {
    public int sumOfPrimesInRange(int n) {
        int temp=n;
        int rev=0;
        while(temp!=0){
            int digit = temp%10;
            rev = rev*10+digit;
            temp /= 10;
        }
        int sum=0;
        int min = Math.min(n,rev);
        int max = Math.max(n,rev);
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
    public boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}