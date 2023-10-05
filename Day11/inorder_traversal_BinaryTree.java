//   https://leetcode.com/problems/binary-tree-inorder-traversal/



package Day11;

import java.util.ArrayList;
import java.util.List;


public class inorder_traversal_BinaryTree {
     List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return ans;
        }
         
        inorderTraversal(root.left);
        ans.add(root.val);
         inorderTraversal(root.right);
         return ans;
}
}
