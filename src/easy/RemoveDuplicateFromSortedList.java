package easy;

public class RemoveDuplicateFromSortedList {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head  = null;
        new RemoveDuplicateFromSortedList().deleteDuplicates(head);
    }

    private ListNode deleteDuplicates(ListNode head) {

        ListNode pointer = head;

        while(pointer != null) {

            if(pointer.next != null && pointer.val == pointer.next.val) {
                pointer.next = pointer.next.next;
                continue;
            }

            pointer = pointer.next;

        }

        return head;
    }
}
