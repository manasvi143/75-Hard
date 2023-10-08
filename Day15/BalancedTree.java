
//   https://leetcode.com/problems/balanced-binary-tree/

package Day15;

public class BalancedTree {
    public int hight(TreeNode root){
        if(root == null)
        return 0;

        int right = hight(root.right);
        int left = hight(root.left);

        return Math.max(right , left) +1;
    }
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)
        return true;

        if(hight(root.left)- hight(root.right) > 1 ||hight(root.left)- hight(root.right) < -1 )
        return false;

        boolean right = isBalanced(root.right);
        boolean left = isBalanced(root.left);

        if(right == false || left == false)
        return false;

        return true;
    }
}
