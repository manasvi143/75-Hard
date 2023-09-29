package Day6;

import Day5.TreeNode;

public class NumberOfNodesGreaterThanX {
    public static int numNodeGreater(TreeNode<Integer> root,int x){

		if(root == null)
		return 0;

		int ans = 0 ;

		if(root.data > x){
			ans++;
		}
		for(int i = 0 ; i < root.children.size() ; i++){
			int greater = numNodeGreater(root.children.get(i), x);
		ans = ans+greater;
		}
		return ans;
	}
}
