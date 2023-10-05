//    https://leetcode.com/problems/binary-tree-postorder-traversal/

package Day12;

import java.util.ArrayList;
import java.util.List;

public class postOrder_BinaryTree {
         List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
      
      if(root == null){
          return ans;
      }
      postorderTraversal( root.left); 
      postorderTraversal( root.right);
      ans.add(root.val); 

      return ans;
    }
}
