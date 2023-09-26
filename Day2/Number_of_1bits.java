//    https://leetcode.com/problems/number-of-1-bits/

package Day2;

public class Number_of_1bits {
    public int hammingWeight(int a) {
        
        int ans = 0;
       while(a != 0){
           ans++;
           a &= (a-1);
           
       }
       return ans;
   }
}
