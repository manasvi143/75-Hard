//     https://leetcode.com/problems/binary-tree-preorder-traversal/

package Day12;

import java.util.ArrayList;
import java.util.List;

public class PreOrder_BinaryTree {
     List<Integer> ans = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root == null){
            return ans;
        }

        ans.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return ans;
    }
}
