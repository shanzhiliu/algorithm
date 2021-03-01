package N叉树的前序遍历_589;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorder(Node root) {

        List<Integer> list = new ArrayList<>();
        preOrderTree(root,list);
        return list;
    }

    private void preOrderTree(Node root, List<Integer> list) {

        if(root == null) return;

        list.add(root.val);

        for (Node node : root.children) {
            preOrderTree(node,list);
        }
    }


}