package dsaWeekly.w5;

public class detectCycleinLL {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        detectCycleinLL solution = new detectCycleinLL();

        // Example 1: List with no cycle: 1 -> 2 -> 3 -> null
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        System.out.println("Cycle in list 1? " + solution.hasCycle(head1)); // false

        // Example 2: List with cycle: 1 -> 2 -> 3 -> 4 -> 2 ...
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = head2.next; // cycle here
        System.out.println("Cycle in list 2? " + solution.hasCycle(head2)); // true
    }
}
