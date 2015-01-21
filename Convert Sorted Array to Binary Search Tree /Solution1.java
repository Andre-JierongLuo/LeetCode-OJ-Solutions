/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // first solution that pass all the tests, but it actually wastes a lot of space.
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length == 0)
            return null;
            
        TreeNode BST = new TreeNode(num[num.length / 2]);
        if(num.length == 1)
            return BST;
        
        int[] leftNode = new int[num.length/2];
        int gap = num.length - leftNode.length - 1;
        int[] rightNode = new int[gap];
        
        
        for(int i = 0; i < leftNode.length; i++){
            leftNode[i] = num[i];
        }
        for(int j = 0; j < gap; j++){
            rightNode[j] = num[j + leftNode.length + 1];
        }
        
        BST.left = sortedArrayToBST(leftNode);
        BST.right = sortedArrayToBST(rightNode);
        
        return BST;
    }
}