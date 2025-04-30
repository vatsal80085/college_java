package dsaWeekly.w1;

public class secondLargest {

    public static int secondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = largest;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            if (arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            return -1;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 43, 21, 546, 221 };
        System.out.println(secondLargestElement(arr));
    }
}
