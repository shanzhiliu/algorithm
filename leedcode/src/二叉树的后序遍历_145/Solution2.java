
package 二叉树的后序遍历_145;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution2 {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        postorderTraversalStackTree(root,result);
        return result;
    }

    private void postorderTraversalStackTree(TreeNode root, List<Integer> result) {
        if(root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            while (root.left != null) {
                stack.push(root.left);
                root = root.left;
            }

            while (root.right != null) {
                stack.push(root.right);
                root = root.right;
            }

            root = stack.pop();
            result.add(root.val);


        }

    }
}