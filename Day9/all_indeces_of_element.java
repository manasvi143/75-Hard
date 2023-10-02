/*Given an array of length N and an integer x, you need to 
find all the indexes where x is present in the input array.
 Save all the indexes in the output array (in increasing order).

Do this recursively. Indexing in the array starts from 0. 

Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
*/

package Day9;

public class all_indeces_of_element {
    public static int[] allIndexes(int input[], int x) {
        return allIndexes(input,x,0);

    }
    private static int[] allIndexes(int input[],int x,int startIndex){
        if(startIndex==input.length)
        {
            int output[]=new int[0];
            return output;
        }
        int smallAns[]=allIndexes(input,x,startIndex+1);
        if(input[startIndex]==x)
        {
            int answer[]=new int[smallAns.length+1];
            answer[0]=startIndex;
            for(int i=0;i<smallAns.length;i++){
              answer[i+1]=smallAns[i];
            }
             return answer;
        }
       else
           return smallAns;
    }
}
