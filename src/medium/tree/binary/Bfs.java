package medium.tree.binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> tempQueue = new LinkedList<>();
        tempQueue.add(root);

        while(!tempQueue.isEmpty()) {

            queue.addAll(tempQueue);
            tempQueue.clear();

            List<Integer> levelNodes = new ArrayList<>();
            while (!queue.isEmpty()) {

                TreeNode node = queue.remove();

                if(node.left != null ) {
                    tempQueue.add(node.left);
                }

                if(node.right !=null) {
                    tempQueue.add(node.right);
                }

                levelNodes.add(node.val);
            }

            result.add(levelNodes);
        }

        return result;
    }
}
