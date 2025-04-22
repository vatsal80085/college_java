package sorting;
public class quickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        print(arr);
        System.out.println("*****************************");
        quicksort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[hi];
        arr[hi] = temp;
        return i;
    }

    public static void quicksort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = partition(arr, lo, hi);
        quicksort(arr, lo, pivot - 1);
        quicksort(arr, pivot + 1, hi);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}