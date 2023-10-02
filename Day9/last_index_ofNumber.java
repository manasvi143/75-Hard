/*Given an array of length N and an integer x, you need to find and 
return the last index of integer x present in the array. Return -1 if 
it is not present in the array.

Last index means - if x is present multiple times in the array, 
return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.

Sample Input :
4
9 8 10 8
8
Sample Output :
3
*/

package Day9;

public class last_index_ofNumber {
    public static int helper(int input[], int x , int i  ){
		if(i == input.length){
			return -1;
		}
		int ans = helper(input, x, i+1);
		if(ans == -1){
			if(input[i] == x){
				return i;
			}
		}
		return ans;
	}

	public static int lastIndex(int input[], int x) {
		return helper(input, x, 0);
	
		
	}
}
