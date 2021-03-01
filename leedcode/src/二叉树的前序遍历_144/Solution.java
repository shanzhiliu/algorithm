package 二叉树的前序遍历_144;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> resultList = new ArrayList<>();
        preOrderTree(root,resultList);
        return  resultList;
    }

    private void preOrderTree(TreeNode root, List<Integer> resultList) {
        if(root == null) return;

        resultList.add(root.val);

        preOrderTree(root.left,resultList);
        preOrderTree(root.right,resultList);
    }
}