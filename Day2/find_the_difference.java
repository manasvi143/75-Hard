//     https://leetcode.com/problems/find-the-difference/  

package Day2;

public class find_the_difference {
    public char findTheDifference(String s, String t) {
        
        if(s == ""){
            return t.charAt(0);
        }

        int ans = t.charAt(0);
         

        for(int i = 1 ; i < t.length() ; i++ ){

            ans = (char)ans ^ s.charAt(i-1) ^ t.charAt(i);
        }
        return (char)ans;
    }
}
