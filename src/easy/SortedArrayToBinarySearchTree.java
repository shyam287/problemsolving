package easy;

public class SortedArrayToBinarySearchTree {

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
        int[] nums = {};
        new SortedArrayToBinarySearchTree().sortedArrayToBST(nums);

    }

    public TreeNode sortedArrayToBST(int[] nums) {

        return prepareBst(nums, 0, nums.length-1);
    }

    public TreeNode prepareBst(int[] nums, int startIndex, int endIndex) {

        if(startIndex > endIndex) {
            return null;
        }

        int mid = (startIndex+endIndex)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.val = nums[mid];
        root.left = prepareBst(nums,startIndex, mid-1);
        root.right = prepareBst(nums, mid+1, endIndex);

        return root;
    }
}
