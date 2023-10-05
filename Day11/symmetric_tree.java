//    https://leetcode.com/problems/symmetric-tree/

package Day11;

public class symmetric_tree {
    public  boolean helper(TreeNode rootleft , TreeNode rootright){
        if(rootleft == null && rootright == null)
        return true;

        if((rootleft == null && rootright != null) || (rootleft != null && rootright == null))
        return false;

        if(rootleft.val != rootright.val)
        return false;
        

        return (helper(rootleft.left , rootright.right) && helper(rootleft.right , rootright.left));
    }
    public boolean isSymmetric(TreeNode root) {
       
        return helper(root.left , root.right);
    }
}

