//   https://leetcode.com/problems/intersection-of-two-linked-lists/

package Day15;

import java.util.HashMap;

public class Intersection_of_two_LL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null)
        return null;
        
        HashMap<ListNode , Integer> ans = new HashMap<>();

        while(headA != null){
            ans.put(headA , 1);
            headA = headA.next;
        }

        while(headB != null){

            if(ans.containsKey(headB))
            return headB;
            else
            headB = headB.next;
        }
        return headB;
    }
}
