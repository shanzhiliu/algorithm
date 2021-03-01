package 二叉树的中序遍历_94;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.logging.Level;

class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        stackTraverseTree(root,result);
        return result;
    }

    private void stackTraverseTree(TreeNode root, List<Integer> result) {
        if(root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode node = root; // peek
        boolean flag = true; //判断是否是已经在的左节点

        while (!stack.isEmpty()) {

            while (node.left != null && flag) {
                stack.push(node.left);
                node = node.left;
            }

            //拿出来 node
            node = stack.pop();
            result.add(node.val);

            if(node.right != null) {
                stack.push(node.right);
                node = node.right;
                flag = true;
            } else {
                //没有右 直接拿出来了,就不在往左拿了.
                flag = false;
            }
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode();
        root.val = 3;

        TreeNode three = new TreeNode();
        three.val = 1;

        TreeNode one = new TreeNode();
        one.val = 2;


        root.left=three;
        root.right=one;



        Solution2 solution2 = new Solution2();
        List<Integer> list = solution2.inorderTraversal(root);

        list.forEach(s -> System.out.println(s));

    }
}