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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return count;
    }

    public pair solve(TreeNode root){
        if(root==null) return new pair(0,0);

        pair left = solve(root.left);
        pair right = solve(root.right);

        int sum = root.val+left.first+right.first;
        int nodecount = 1+left.second+right.second;

        if((sum/nodecount)==root.val){
            count++;
        }

        return new pair(sum,nodecount);
    }
}
class pair{
    int first;
    int second;
    pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}