/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
* Solution that using recursion.
*/
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return p == q;
        } else {
            return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        
       
    }
}