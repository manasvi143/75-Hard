//   https://leetcode.com/problems/single-number/  

package Day1;

public class single_number {
    public int singleNumber(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        
        int ans = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++){
            ans = ans ^ nums[i];
        }

        return ans;
    }
}
