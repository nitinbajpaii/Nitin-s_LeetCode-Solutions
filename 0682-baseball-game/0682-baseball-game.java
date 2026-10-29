class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(String word : operations){
            if(!word.equals("C")&&!word.equals("D")&&!word.equals("+")){
                arr.add(Integer.parseInt(word));
            }
            else if(word.equals("C")){
                arr.remove(arr.size()-1);
            }
            else if(word.equals("D")){
                arr.add(arr.get(arr.size()-1)*2);
            }
            else if(word.equals("+")){
                int n=arr.size();
                arr.add(arr.get(n-1)+arr.get(n-2));
            }
        }
        int sum=0;
        for(int x: arr){
            sum += x;
        }
        return sum;
    }
}