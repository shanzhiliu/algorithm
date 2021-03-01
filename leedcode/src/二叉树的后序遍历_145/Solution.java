
package 二叉树的后序遍历_145;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        postorderTraversalTree(root,result);
        return result;
    }

    private void postorderTraversalTree(TreeNode root, List<Integer> result) {
        if(root == null) return;

        postorderTraversalTree(root.left,result);
        postorderTraversalTree(root.right,result);
        result.add(root.val);

    }
}