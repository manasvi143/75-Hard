//   https://leetcode.com/problems/palindrome-number/

package Day14;

public class Palindrome_numbers {
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder(String.valueOf(x));
         s.reverse();
        
         return s.toString().equals(x + "");
     }
}
