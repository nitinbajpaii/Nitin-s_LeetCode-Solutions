class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean s1Breaks = true;
        boolean s2Breaks= true;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<arr2[i]){
                s1Breaks = false;
            }
            if(arr2[i]<arr1[i]){
                s2Breaks=false;
            }
        }
        return s1Breaks || s2Breaks;
    }
}