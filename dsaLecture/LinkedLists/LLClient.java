public class LLClient {

    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(8);
        list.insertFirst(8);
        list.insertFirst(2);
        list.insertFirst(0);
        list.insertFirst(0);
        list.insertFirst(5);
        list.insert(24, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        // list.insertLast(8);
        // list.insertLast(8);
        // list.insertLast(2);
        // list.insertLast(0);
        // list.insertLast(0);
        // list.insertLast(5);
        // list.display();

    }
}
