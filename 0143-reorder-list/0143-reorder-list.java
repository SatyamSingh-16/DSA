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
    public void reorderList(ListNode head) {

        if (head == null) return;

        ArrayList<ListNode> arr = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            arr.add(temp);
            temp = temp.next;
        }

        int l = 0;
        int r = arr.size() - 1;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l < r) {

            curr.next = arr.get(l);
            curr = curr.next;

            curr.next = arr.get(r);
            curr = curr.next;

            l++;
            r--;
        }

        if (l == r) {
            curr.next = arr.get(l);
            curr = curr.next;
        }

        curr.next = null;
    }
}