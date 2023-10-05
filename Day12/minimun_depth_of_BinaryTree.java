//     https://leetcode.com/problems/minimum-depth-of-binary-tree/ 

package Day12;

public class minimun_depth_of_BinaryTree {
    public  int minDepth(TreeNode root) {
        
        if(root == null)
        return 0;

        int L = minDepth(root.left);
        int R = minDepth(root.right);

       if(L == 0 || R == 0)
       return Math.max(L,R) +1;

       return Math.min(R,L)+1;

       
    }
}
