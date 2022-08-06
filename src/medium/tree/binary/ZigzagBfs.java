package medium.tree.binary;

import jdk.nashorn.api.tree.Tree;

import java.util.*;

public class ZigzagBfs {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode> tempStack= new Stack<>();

        boolean leftToRight = true;
        tempStack.push(root);

        while(!tempStack.isEmpty()) {

            List<Integer> levelNodes = new ArrayList<>();
            Stack<TreeNode> zigZagNodes = new Stack<>();
            zigZagNodes.addAll(tempStack);
            tempStack.clear();


            while(!zigZagNodes.isEmpty()) {
                TreeNode node = zigZagNodes.pop();
                if(node == null) {
                    continue;
                }
                levelNodes.add(node.val);
                if(leftToRight) {
                    tempStack.push(node.left);
                    tempStack.push(node.right);
                } else {
                    tempStack.push(node.right);
                    tempStack.push(node.left);
                }
            }

            leftToRight = !leftToRight;

            if(!levelNodes.isEmpty()) {
                result.add(levelNodes);
            }
        }

        return result;
    }
}
