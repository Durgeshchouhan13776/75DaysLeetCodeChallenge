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
    ArrayList<TreeNode> ls = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build(0,ls.size()-1);
       }
    public void inorder(TreeNode root){
         if (root == null) return;
        inorder(root.left);
        ls.add(root);
        inorder(root.right);
    }
    public TreeNode build(int start,int end){
        if(start>end) return null;
        int mid = (start+end)/2;

        TreeNode root = ls.get(mid);
        root.left = build(start,mid-1);
        root.right = build(mid+1,end);
        return root;
    }
    }
    