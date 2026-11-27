class Solution {
    public int[] scoreValidator(String[] events) {
        int[] arr = new int[2];
        int score=0;
        int counter=0;
        for(String w: events){
            if(counter==10) break;
            if(w.equals("W")){
                counter ++;
            }
            else if(w.equals("WD") || w.equals("NB")){
                score++;
            }
            else{
                score += Integer.parseInt(w);
            }
        }
        arr[0]=score;
        arr[1]=counter;
        return arr;
    }
}