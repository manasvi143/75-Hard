package Day8;

import Day7.BinaryTreeNode;

public class preOrderTraversal {
    public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null){
			return ;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

}
