//   https://leetcode.com/problems/linked-list-cycle/

package Day15;

import java.util.HashMap;

public class ListCycle {
    public boolean hasCycle(ListNode head) {

        HashMap<ListNode , Integer> temp = new HashMap<>();
        
        while(head != null){

            if(temp.containsKey(head))
            return true;

            temp.put(head , 1);
            head = head.next;
        }

        return false;
    }
}
