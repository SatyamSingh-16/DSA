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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode small = new ListNode(-1);
        ListNode smallS = small;
        ListNode big = new ListNode(-1);
        ListNode bigS = big;

        while(temp != null){

            ListNode next = temp.next;   
            temp.next = null;  

            if(temp.val < x){
                small.next = temp;
                small = small.next;
            }else{
                big.next = temp;
                big = big.next;
                
            }
            temp = next;
        }
        small.next = bigS.next;
        return smallS.next;
    }
}