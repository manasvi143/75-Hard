/*For a given a Binary Tree of type integer, 
duplicate every node of the tree and attach it to the left of itself.

The root will remain the same. So you just need to insert nodes in the given Binary Tree.

*/

package Day8;

import Day7.BinaryTreeNode;

public class create_and_insert_duplicate_tree {
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if(root == null){
			return;
		}
		insertDuplicateNode(root.left);
		BinaryTreeNode<Integer> temp1 = root.left;
		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(root.data);
		root.left = temp;
		temp.left = temp1;
		insertDuplicateNode(root.right);
	}
}
