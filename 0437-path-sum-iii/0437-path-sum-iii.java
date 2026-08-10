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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        return dfs(root,targetSum,0)+ pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }

    public int dfs(TreeNode root, int targetSum, long pSum){
        if(root==null) return 0;

        pSum+=root.val;
        int count =0;

        if(pSum==targetSum){
            count++;
        }

        count+=dfs(root.left,targetSum,pSum);
        count+=dfs(root.right,targetSum,pSum);

        return count;
    }
}