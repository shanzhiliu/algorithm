package 二叉树的前序遍历_144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution2 {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> resultList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return resultList;

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            resultList.add(pop.val);

            if(pop.right != null) {
                stack.push(pop.right);
            }

            if(pop.left != null) {
                stack.push(pop.left);
            }

        }


        return  resultList;
    }


}