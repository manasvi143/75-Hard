//     https://leetcode.com/problems/invert-binary-tree/

package Day12;

public class invert_Binary_tree {
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null)
        return null;

       TreeNode L =  invertTree( root.left);
       TreeNode R =  invertTree( root.right);

        
        root.right = L;
        root.left = R;
       return root;
    }
}
