package easy;

public class TreeMaxDepth {

    public static void main(String[] args) {
        TreeNode root= null;
        new TreeMaxDepth().maxDepth(root);
    }

    public int maxDepth(TreeNode root) {

        if(root == null) {
            return 0;
        }

        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }
}
