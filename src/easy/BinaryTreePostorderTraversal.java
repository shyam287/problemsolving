package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return getPreorderTraversal(root, result);
    }

    private List<Integer> getPreorderTraversal(TreeNode root, List<Integer> result) {
        if(root == null) {
            return result;
        }

        getPreorderTraversal(root.left, result);
        getPreorderTraversal(root.right, result);
        result.add(root.val);

        return result;
    }

}
