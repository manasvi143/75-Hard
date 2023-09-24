
/*-  https://leetcode.com/problems/remove-duplicates-from-sorted-array/  -*/
package Day1 ;

public class Remove_duplicate_from_sorted_array {
    public int removeDuplicates(int[] nums) {

        int j = 1 ;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
