package Day8;

import Day7.BinaryTreeNode;

public class Diameter_of_binaryTree {
    	public static int height(BinaryTreeNode<Integer> root){
		if(root == null){
			return 0;
		}
		return (1+Math.max(height(root.left), height(root.right)));
	}

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here

		if(root == null){
			return 0;
		}

		int option1 = height(root.left) + height(root.right);
		int option2 = diameterOfBinaryTree(root.left);
		int option3 = diameterOfBinaryTree(root.right);

		return (1 +Math.max(option1, Math.max(option2, option3)));
	}
}
