import java.util.*;

class sortingAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // insertion sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // selection sort
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int minIndex = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[j] < arr[minIndex]) {
        //             minIndex = j;
        //         }
        //     }
        //     if (minIndex != i) {
        //         int temp = arr[minIndex];
        //         arr[minIndex] = arr[i];
        //         arr[i] = temp;
        //     }
        // }

        // bubble sort
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }

        // output
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}