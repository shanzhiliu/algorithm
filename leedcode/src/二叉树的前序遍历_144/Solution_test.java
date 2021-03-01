package 二叉树的前序遍历_144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution_test {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();
            resultList.add(node.val);

            if(node.right != null) {
                stack.push(node.right);
            }

            if(node.left != null) {
                stack.push(node.left);
            }
        }

        return  resultList;
    }


}