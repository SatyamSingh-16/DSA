class Solution {
    public int[] nextLargerNodes(ListNode head) {

        ListNode temp = head;
        ListNode temp1 = head;
        int count = 0;

        while (temp1 != null) {
            count++;
            temp1 = temp1.next;
        }

        int[] arr = new int[count];
        for (int i = 1; i <= count; i++) {
            ListNode runn = temp.next;
            arr[i - 1] = 0; 
            while (runn != null) {
                if (runn.val > temp.val) {
                    arr[i - 1] = runn.val;
                    break;
                }

                runn = runn.next;
            }

            temp = temp.next;
        }

        return arr;
    }
}