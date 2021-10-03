package easy;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {

        if(head == null) {
            return false;
        }

        ListNode fastPointer = head.next;

        boolean loopFound = false;
        while(fastPointer != null) {

            if(fastPointer == head) {
                loopFound = true;
                break;
            }

            fastPointer = fastPointer.next != null ? fastPointer.next.next : null;
            head = head.next;
        }

        return loopFound;
    }

}
