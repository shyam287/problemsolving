package medium;

public class RotateList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {

         if(head == null) {
             return head;
         }

        ListNode ptr = head;
        int length = 1;

         while(ptr.next !=null) {
             ptr = ptr.next;
             length++;
         }

         ptr.next = head;
         ptr = head;

        int countNodes = 1;
         while(countNodes < length - k % length ) {
             countNodes++;
             ptr = ptr.next;
         }

         head = ptr.next;
         ptr.next = null;

         return head;
    }

}
