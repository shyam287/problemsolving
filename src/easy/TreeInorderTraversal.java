package easy;

import java.util.ArrayList;
import java.util.List;

public class TreeInorderTraversal {


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
