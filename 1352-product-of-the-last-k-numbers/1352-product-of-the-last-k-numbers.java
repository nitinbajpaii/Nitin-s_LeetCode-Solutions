class ProductOfNumbers {
    ArrayList<Integer> arr;

    public ProductOfNumbers() {
        arr = new ArrayList<>();
    }
    
    public void add(int num) {
        arr.add(num); 
    }
    
    public int getProduct(int k) {
        int n = arr.size();
        int pro = 1;
        for(int i=n-k;i<n;i++){
            pro *= arr.get(i);
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */