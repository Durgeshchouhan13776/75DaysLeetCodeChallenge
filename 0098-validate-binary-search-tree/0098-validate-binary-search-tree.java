class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBst(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;

        if (root.val <= minVal || root.val >= maxVal)
            return false;

        return isValidBst(root.left, minVal, root.val) &&
               isValidBst(root.right, root.val, maxVal);
    }
}