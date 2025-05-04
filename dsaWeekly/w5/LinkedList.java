package dsaWeekly.w5;

public class LinkedList {

    class Node {
        int data;
        Node nn;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size = 0;

    // add value at the beginning of the linked list
    public void addFirst(int val) {
        Node nn = new Node();
        nn.data = val;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    // add value at the end of the linked list
    public void addLast(int val) {
        Node nn = new Node();
        nn.data = val;
        if (size == 0) {
            addFirst(val);
        } else {
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    // remove the first element of the linked list
    public void removeFirst() throws Exception {
        if (size == 0) {
            throw new Exception("List is empty");
        } else if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
    }

    // remove the last element of the linked list
    public void removeLast() throws Exception {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (size == 1) {
            removeFirst();
        } else {
            Node temp = getNodeAt(size - 1);
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    // remove at any index of the linked list
    public void removeAt(int idx) throws Exception {
        if (idx < 0 || idx >= size) {
            throw new Exception("Invalid index");
        } else if (idx == 0) {
            removeFirst();
        } else if (idx == size - 1) {
            removeLast();
        } else {
            Node temp = getNodeAt(idx - 1);
            temp.next = temp.next.next;
            size--;
        }
    }

    private Node getNodeAt(int idx) throws Exception {
        if (idx > size) {
            throw new Exception("invalid index hai");
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void print() {
        print(head);
    }

    private void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
