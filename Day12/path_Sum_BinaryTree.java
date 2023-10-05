//   https://leetcode.com/problems/path-sum/

package Day12;

public class path_Sum_BinaryTree {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null )
        return false;

        targetSum -= root.val;
      
        if(( root.right == null &&  root.left == null) && targetSum == 0)
        return true;

       boolean L = hasPathSum(root.left , targetSum);
       boolean R = hasPathSum(root.right , targetSum);

       return(L||R);
    }
}
