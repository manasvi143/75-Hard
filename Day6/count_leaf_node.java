/*Given a generic tree, count and return the number of leaf nodes present
 in the given tree. A node is said to be a leaf node if it's not having any child
 */

package Day6;

import Day5.TreeNode;

public class count_leaf_node {
    public static int countLeafNodes(TreeNode<Integer> root){

		if(root == null){
			return 0;
		}

		if(root.children.isEmpty()){
			return 1;
		}
		int ans = 0;

		for(int i = 0 ; i< root.children.size() ; i++){
			int leafCount = countLeafNodes(root.children.get(i));
			ans = ans+leafCount;
			
		}
		return ans;
	}
}
