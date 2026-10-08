class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        return solve(s, 0, dp);
    }

    public int solve(String s, int i, int[] dp) {
        if (i == s.length()) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int ans = Integer.MAX_VALUE;
        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(s, i, j)) {
                if (j == s.length() - 1) {
                    ans = 0;
                } else {
                    ans = Math.min(ans, 1 + solve(s, j + 1, dp));
                }

            }
        }
        return dp[i] = ans;
    }

    public boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}