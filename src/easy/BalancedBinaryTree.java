package easy;

public class BalancedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
    }

    private boolean isBalanced(TreeNode root) {

        if(root == null) {
            return true;
        }

        return getHeightDifference(root) == -1 ? false : true;
    }

    private int getHeightDifference(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = getHeightDifference(root.left);
        if(left == -1) {
            return -1;
        }

        int right = getHeightDifference(root.right);
        if(right == -1) {
            return -1;
        }

        return Math.abs(left - right) <=1 ? 1 + Math.max(left, right) : -1;
    }
}
