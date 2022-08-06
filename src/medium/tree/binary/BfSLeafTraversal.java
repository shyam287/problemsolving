package medium.tree.binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfSLeafTraversal {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        levelOrderBottom(result, queue);
        return result;
    }

    public void levelOrderBottom(List<List<Integer>> result, Queue<TreeNode> queue) {

        if(queue.isEmpty()) {
            return;
        }

        Queue<TreeNode> childNodes = new LinkedList<>();
        List<Integer> currentLevelNodes = new ArrayList<>();

        while(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            currentLevelNodes.add(node.val);

            if(node.left !=null) {
                childNodes.add(node.left);
            }

            if(node.right != null) {
                childNodes.add(node.right);
            }
        }

        levelOrderBottom(result, childNodes);
        result.add(currentLevelNodes);
    }
}
