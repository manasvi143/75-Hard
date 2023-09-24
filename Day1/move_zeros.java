/*   https://leetcode.com/problems/move-zeroes/    */

package Day1;

public class move_zeros {
    public void moveZeroes(int[] nums) {
        int j = 0 ;

        for(int i = 0  ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        if(j != 0){
        for(int i = j ; i < nums.length ; i++){
            // if(i != j-1){
                
            // }
            nums[i] = 0;
        }
    }
    }
}
