class Solution {

    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression, 0, expression.length() - 1);
    }

    static List<Integer> solve(String s, int i, int j) {

        List<Integer> ans = new ArrayList<>();
        boolean hasOperator = false;

        for (int k = i; k <= j; k++) {

            char ch = s.charAt(k);

            if (ch == '+' || ch == '-' || ch == '*') {

                hasOperator = true;
                List<Integer> left = solve(s, i, k - 1);

                List<Integer> right = solve(s, k + 1, j);

                for (int a : left) {
                    for (int b : right) {

                        if (ch == '+') {
                            ans.add(a + b);
                        }
                        else if (ch == '-') {
                            ans.add(a - b);
                        }
                        else if (ch == '*') {
                            ans.add(a * b);
                        }
                    }
                }
            }
        }
        if (!hasOperator) {
            ans.add(Integer.parseInt(s.substring(i, j + 1)));
        }

        return ans;
    }
}