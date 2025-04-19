public class Queue {
    private int[] arr;
    private int front;
    private int size = 0;

    // Constructor that initializes the queue with a default size of 16
    Queue() {
        this.arr = new int[16];
        this.front = 0;
        this.size = 0;
    }

    // Constructor that initializes the queue with a given size
    Queue(int n) {
        this.arr = new int[n];
        this.front = 0;
        this.size = 0;
    }

    // Constructor that initializes the queue with the given array
    Queue(int[] arr) {
        this.arr = arr;
        this.front = 0;
        this.size = 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return this.size == arr.length;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return this.size == 0;
    }

    // Add an element to the queue
    public void enqueue(int val) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }

        int idx = (front + size) % arr.length;
        arr[idx] = val;
        size++;
        System.out.println("Enqueued: " + val);
    }

    // Remove an element from the queue
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int rv = arr[front];
        arr[front] = 0;  // Optional: clear the value at the front position
        front = (front + 1) % arr.length;
        size--;
        System.out.println("Dequeued: " + rv);
        return rv;
    }

    // Display the current elements in the queue
    public void display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}
