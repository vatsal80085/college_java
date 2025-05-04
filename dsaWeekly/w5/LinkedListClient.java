package dsaWeekly.w5;

public class LinkedListClient {
    public static void main(String[] args) {
        System.out.println("1st LinkedList");
        LinkedList ll = new LinkedList();
        ll.addFirst(11);
        ll.addFirst(22);
        ll.addFirst(33);
        ll.addFirst(44);
        ll.addFirst(55);
        ll.print();
        System.out.println("2nd LinkedList");
        LinkedList ll2 = new LinkedList();
        ll2.addLast(12);
        ll2.addLast(24);
        ll2.addLast(36);
        ll2.addLast(48);
        ll2.addLast(60);

        try {
            ll2.removeFirst();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ll2.removeLast();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ll2.print();
    }

}
