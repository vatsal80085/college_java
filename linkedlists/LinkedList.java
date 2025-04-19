class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList {

    private static Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static boolean searchinLL(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    private static Node removesHead(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    private static Node removesTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 24, 5, 6, 8 };
        Node head = convertToLL(arr);
        System.out.println(head.data);
        Node temp = head;
        int size = 0;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            size++;
        }
        System.out.println(searchinLL(head, 24));
        System.out.println("size of LL is " + size);
        head = removesTail(head);
        // head = removesHead(head);
        printLL(head);
        // Node y = new Node(arr[1]);
        // System.out.println(y.data);
    }
}
