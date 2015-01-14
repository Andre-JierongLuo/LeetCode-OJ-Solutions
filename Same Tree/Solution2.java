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
*   Solution that using iteration.
*/

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (p != null && q == null))
            return false;
        if(p == null && q == null)
            return true;
        
        Stack<TreeNode> mystack1 = new Stack<TreeNode>();
        Stack<TreeNode> mystack2 = new Stack<TreeNode>();
        
        mystack1.push(p);
        mystack2.push(q);
        
        while(!mystack1.empty() && !mystack2.empty()){
            TreeNode tmp1 = mystack1.pop();
            TreeNode tmp2 = mystack2.pop();
            if(tmp1.val != tmp2.val)
                return false;
            else {
                if(tmp1.right != null && tmp2.right == null)
                    return false;
                if(tmp1.right == null && tmp2.right != null)
                    return false;
                if(tmp1.right != null && tmp2.right != null){
                    mystack1.push(tmp1.right);
                    mystack2.push(tmp2.right);
                }
                
                if(tmp1.left != null && tmp2.left == null)
                    return false;
                if(tmp1.left == null && tmp2.left != null)
                    return false;
                if(tmp1.left != null && tmp2.left != null){
                    mystack1.push(tmp1.left);
                    mystack2.push(tmp2.left);
                }
            }
        }
        if(!mystack1.empty() || !mystack2.empty())
            return false;
        
        return true;
    }
}