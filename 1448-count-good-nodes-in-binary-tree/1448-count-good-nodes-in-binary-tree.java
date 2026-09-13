/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return solve(root,root.val);  
    }
    public int solve(TreeNode root, int maxSoFar){
        if(root==null){
            return 0 ;
        }
        int count=0;
        if(root.val>=maxSoFar){
            count = 1;
        }
        maxSoFar = Math.max(root.val,maxSoFar);
        count += solve(root.left,maxSoFar);
        count += solve(root.right,maxSoFar);
        return count;
    }
}