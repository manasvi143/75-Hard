/*   https://leetcode.com/problems/search-insert-position/    */

package Day1;

public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        
        int i = 0 ;
        while(nums[i] != target && nums[i] < target){
            i++;
            if( i == (nums.length )){
                return nums.length;
            }
        }
        return i;
    }
}
