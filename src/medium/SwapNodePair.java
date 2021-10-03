package medium;

public class SwapNodePair {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode ptr = head;
        while(ptr != null && ptr.next != null) {

            int temp = ptr.val;
            ptr.val = ptr.next.val;
            ptr.next.val = temp;

            ptr = ptr.next.next;
        }

        return head;

    }

}
