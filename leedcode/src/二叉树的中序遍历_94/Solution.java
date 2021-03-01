package 二叉树的中序遍历_94;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        resuerTree(root,result);
        return result;
    }

    private void resuerTree(TreeNode root, List<Integer> result) {
        if(root == null) return;

        resuerTree(root.left,result);
        result.add(root.val);
        resuerTree(root.right,result);
    }


}