import java.util.PriorityQueue;

public class priorityQueueImplementation {

    public static void K_Largest_element(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // smallest has highest priority by default

        int i = 0;
        while (i < k) {
            pq.add(arr[i]);
            i++;
        }

        while (i < arr.length) {
            if (arr[i] > pq.peek()) {
                pq.remove();
                pq.add(arr[i]);
            } else {
                // do nothing
            }
            i++;
        }

        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }

        // to change priority
        // PriorityQueue<Integer> p1q = new PriorityQueue<>(Collections.reverseOrder());
    }

    public static void main(String[] args) {
        int[] arr = { 3, 10, 4, 2, 11, 7, 6, 20 };
        int k = 3;

        K_Largest_element(arr, k);
    }
}
