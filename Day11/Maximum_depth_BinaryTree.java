//   https://leetcode.com/problems/maximum-depth-of-binary-tree/

package Day11;

public class Maximum_depth_BinaryTree {
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int leftHight = maxDepth(root.left);
        int rightHight = maxDepth(root.right);

        return (Math.max(leftHight , rightHight) +1) ;
    }
}
