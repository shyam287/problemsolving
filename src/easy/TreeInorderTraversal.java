package easy;

import java.util.ArrayList;
import java.util.List;

public class TreeInorderTraversal {

    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {

          List<Integer> result = new ArrayList<>();
          inorderTraversal(root, result);

        return result;
    }

    public void inorderTraversal(TreeNode root, List<Integer> resultList) {

        if(root == null) {
            return;
        }

        inorderTraversal(root.left, resultList);
        resultList.add(root.val);
        inorderTraversal(root.right, resultList);
    }

}
