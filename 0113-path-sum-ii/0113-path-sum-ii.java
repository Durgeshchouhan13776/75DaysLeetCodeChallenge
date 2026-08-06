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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root,targetSum,0,ans,path);
        return ans;
    }

    public void dfs(TreeNode root, int targetSum, int pathSum,  List<List<Integer>> ans,List<Integer> path ){

        if(root==null) return;


        path.add(root.val);
        pathSum+=root.val;


        if((pathSum==targetSum) && (root.left==null&&root.right==null)){
            ans.add(new ArrayList<>(path));
        }


        
        dfs(root.left,targetSum, pathSum,ans,path);
        dfs(root.right,targetSum, pathSum,ans,path);

        path.remove(path.size()-1);
    }
}