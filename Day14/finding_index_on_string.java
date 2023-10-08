//    https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

package Day14;

public class finding_index_on_string {
    public int strStr(String haystack, String needle) {
        
        int hL = haystack.length();
        int nL = needle.length();
        int nIndex = 0;

        for(int i = 0 ; i < hL ; i++){

            if(haystack.charAt(i) == needle.charAt(nIndex)){
            nL--;
            nIndex++;
            }else{
                i = i-nIndex;
                nL = needle.length();
                nIndex = 0 ; 
            }
             if(nL == 0)
            return i-(needle.length())+1;
           

        }
        return -1;
    }
}
