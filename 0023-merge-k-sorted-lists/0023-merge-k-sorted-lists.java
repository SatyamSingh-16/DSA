/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.next = next; this.val = val; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }

        ListNode res = null;
        int len = lists.length;
        int i = 0;

        while (i < len) {
            res = sorting(res, lists[i]);
            i++;
        }

        return res;
    }

    ListNode sorting(ListNode A, ListNode B) {

        ListNode dummy = new ListNode(-1);
        ListNode temp1 = A;
        ListNode temp2 = B;
        ListNode temp3 = dummy;

        while (temp1 != null && temp2 != null) {

            if (temp1.val <= temp2.val) {
                temp3.next = temp1;
                temp1 = temp1.next;
            } else {
                temp3.next = temp2;
                temp2 = temp2.next;
            }

            temp3 = temp3.next;
        }

        while (temp1 != null) {
            temp3.next = temp1;
            temp1 = temp1.next;
            temp3 = temp3.next;
        }

        while (temp2 != null) {
            temp3.next = temp2;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }

        return dummy.next;
    }
}