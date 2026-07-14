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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode temp = head;
        int len = 1;

        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        if(len == 1){
            return head;
        }

        k = k % len;

        if(k == 0){
            return head;
        }
        temp.next = head;

        ListNode newNode = findNode(head,len-k);
        head = newNode.next;
        newNode.next = null;

        return head;
        
    }

    ListNode findNode(ListNode head,int k){
        int cnt = 1;
        while(head != null){
            if(cnt == k){
                return head; 
            }
            cnt++;
            head = head.next;
        }
        return head;
    }
}