class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') {
                    count += Math.abs(i - j);
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}