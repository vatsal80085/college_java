public class QueueClient {
    public static void main(String[] args) throws Exception {
        Queue q =new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.enqueue(60);
        
    }
}
