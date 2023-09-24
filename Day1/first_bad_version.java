//    https://leetcode.com/problems/first-bad-version/

package Day1;

public class first_bad_version {
    public boolean isBadVersion(int n){
        return true;
    }  // sample function

    public int firstBadVersion(int n) {

       
        int low = 0;
        int high = n;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)   return mid;
            else if(isBadVersion(mid)==false ) low = mid+1;
            else high= mid;
        }     
        return -1;
    }
}
