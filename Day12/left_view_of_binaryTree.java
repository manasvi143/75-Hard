//     https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

package Day12;

import java.util.ArrayList;


public class left_view_of_binaryTree {
    ArrayList<Integer> ans = new ArrayList<>();
     ArrayList<Integer> helper(TreeNode root , int level){
         
         if(root == null)
         return null;
         
         if(ans.size() == level)
         ans.add(root.val);
         
         helper(root.left , level +1);
         helper(root.right , level+1);
         
         return ans;
     }
    ArrayList<Integer> leftView(TreeNode root)
    {
        if(root == null)
        return ans;
        
      return helper(root , 0);
      
    }
}
