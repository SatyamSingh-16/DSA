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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode n1 = list1;
        ListNode n2 = list2;
        ListNode n3 = dummy;

        while(n1 != null && n2 != null){
            if(n1.val <= n2.val){
                n3.next = n1;
                n1 = n1.next;
                n3 = n3.next;
            }else{
                n3.next = n2;
                n2 =n2.next;
                n3= n3.next;
            }
        }
        while(n1 != null && n2 == null){
            n3.next = n1;
            n1 = n1.next;
            n3 = n3.next;
        }
        while(n1 == null && n2 != null){
            n3.next = n2;
            n2 =n2.next;
            n3= n3.next;
        }

        return dummy.next;
        
    }
}