package dsaWeekly.w1;

import java.util.Arrays;

public class checkSorted {

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 43, 21, 546, 221 };
        Arrays.sort(arr);
        System.out.println(isSorted(arr));
    }
}
