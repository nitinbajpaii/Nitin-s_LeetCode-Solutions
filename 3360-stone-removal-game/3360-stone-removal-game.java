class Solution {
    public boolean canAliceWin(int n) {
        int stones = n;
        int remove = 10;
        boolean alice = true;
        while(stones>=remove){
            stones -= remove;
            remove--;
            alice = !alice;
        }
        return !alice;
    }
}