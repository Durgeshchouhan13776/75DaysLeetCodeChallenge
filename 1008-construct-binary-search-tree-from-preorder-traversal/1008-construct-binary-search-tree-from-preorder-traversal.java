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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        TreeNode root = new TreeNode(preorder[0]);

        for(int i=1; i<n; i++){
            TreeNode curr = root;
            while(true){
                if(preorder[i]<curr.val){
                    if(curr.left==null){
                        curr.left = new TreeNode(preorder[i]);
                        break;
                    }
                    else{
                        curr = curr.left;
                    }
                }
                else{
                    if(curr.right==null){
                        curr.right = new TreeNode(preorder[i]);
                        break;
                    }
                    else{
                        curr = curr.right;
                    }
                }
            }
        }
        return root;
    }
}