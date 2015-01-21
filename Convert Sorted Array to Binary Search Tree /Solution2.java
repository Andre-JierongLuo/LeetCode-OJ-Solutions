/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/* solution 2 is a little bit slower than solution 1,
    but it doesn't take a lot of space as solution 1.
*/

public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length == 0)
            return null;
            
        TreeNode BST = helper(0, num.length - 1, num);
        return BST;
    }
    
    public TreeNode helper(int left, int right, int[] num){
        if(left > right)
            return null;
        
        int mid = (right + left) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(left, mid - 1, num);
        node.right = helper(mid + 1, right, num);
        
        return node;
    }
}