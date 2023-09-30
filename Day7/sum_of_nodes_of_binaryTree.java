package Day7;

public class sum_of_nodes_of_binaryTree {
    public static int getSum(BinaryTreeNode<Integer> root) {

		if(root == null){
			return 0;
		}

		int ans = root.data;

		ans += getSum(root.left);
		ans += getSum(root.right);

		return ans;
		
	}
}
