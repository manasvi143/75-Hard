//   https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

package Day15;

public class convertedSortedArray_to_BST {
    public TreeNode helper(int[] nums , int si , int ei){
        if(si >ei)
            return null;

        int mid = (ei+si)>>1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums , si , mid-1);
        root.right = helper(nums, mid+1, ei);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums == null)
        return null;

        return helper(nums ,0 , nums.length-1);
    }
}
