package Day10;

import Day7.BinaryTreeNode;

public class search_node_in_BST {
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		
		if(root == null){
			return false;
		}
		if(root.data == k){
			return true;
		}

		if(k > root.data){
			root = root.right;
		}else{
			root = root.left;
		}
		return searchInBST(root , k);
	}
}

