/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class Solution {    
    public boolean isUnivalTree(TreeNode root) {
        boolean left = true,  right = true ;
        
        //this expression stops evaluating if the left side is true and its null, THEN IT STOPS EVALUATING., so until then it also evaluates the right side, which checks if the right root value is equal to value of the original root above it and recruivsely keeps going through the tree
        right = (root.right==null || root.right.val==root.val && isUnivalTree(root.right));
        left = (root.left==null || root.left.val==root.val && isUnivalTree(root.left));
        return left && right;
    }
}