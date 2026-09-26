class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int x1 = source[0];
        int y1 = source[1];
        int x2 = target[0];
        int y2 = target[1];
        if(x1==x2 && y1==y2){
            return 0;
        }
        if(x1==x2 || y1==y2){
            return 1;
        }
        if(Math.abs(x1-x2)==Math.abs(y1-y2)){
            return 1;
        }
        return 2;  
    }
}