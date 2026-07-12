/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp1 = head;
        int count = 0;
        int count1 = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int remove = count-n+1;
        if(remove == 1){
            head = head.next;
            return head;
        }

        ListNode prev = null;
        while(temp1 != null){
            count1++;
            if(count1 == remove){
                prev.next = temp1.next;
                break;
            }
            prev = temp1;
            temp1 = temp1.next;
        }

        return head;

    }
}