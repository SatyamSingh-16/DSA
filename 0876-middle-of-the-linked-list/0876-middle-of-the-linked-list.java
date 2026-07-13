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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = head;
        int total = 0;
        int middle = 0;;
        while(temp != null){
            total++;
            temp = temp.next;
        }

        if(total %2 ==0){
            middle = (total / 2)+1;
        }else{
            middle = (total /2) + 1;
        }
        int req = 0;
        while(temp1 != null){
            req++;
            if(req == middle){
                return temp1;
            }
            temp1 = temp1.next;
        }

        return null;

    }
}