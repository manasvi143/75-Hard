//    https://leetcode.com/problems/same-tree/


package Day11;

public class same_tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }

        if(p.val != q.val)
        return false;
        
        boolean leftTree =  isSameTree( p.left,  q.left);
        boolean rightTree =  isSameTree( p.right,  q.right);

            if(leftTree == true && rightTree == true){
                return true;
            }
        return false;
}
}
