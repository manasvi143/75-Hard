//  https://leetcode.com/problems/add-two-numbers/  

package Day16;

public class Add_two_number_LL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry = 0 ;

        while(l1 != null || l2 != null || carry != 0){

            int digit1 = l1 != null ? l1.val : 0;
            int digit2 = l2 != null ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum%10;
            carry = sum/10;

            ListNode temp1 = new ListNode(digit);
            temp.next = temp1;
            temp = temp1;

            l1  = l1 != null ? l1 = l1.next : null;
            l2  = l2 != null ? l2 = l2.next : null;
        }
        return ans.next;
    }
}
