//    https://leetcode.com/problems/count-complete-tree-nodes/

package Day12;

public class count_number_of_nodes_BinaryTree {
    public int countNodes(TreeNode root) {
        
        if(root == null)
        return 0;

        int R = countNodes( root.right);
        int L = countNodes( root.left);

        return R+L+1;
    }
}
