/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    Stack<TreeNode> mystack = new Stack<TreeNode>();
    
    public BSTIterator(TreeNode root) {
        if(root != null){
            mystack.push(root);
            TreeNode tmp = root.left;
        
            // add the left most path into mystack.
            while(tmp != null){
                mystack.push(tmp);
                tmp = tmp.left;
            }
        }
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !mystack.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode nextNode = mystack.pop();
        int soln = nextNode.val;
        TreeNode cur = nextNode.right;
        /*
        *   since this is a binary search tree,
        *   a node's right node is smaller than that node's parent node.
        */
        if(cur != null){
            while(cur != null){
                mystack.push(cur);
                cur = cur.left;
            }
        }
        return soln;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */