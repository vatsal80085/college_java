package dsaWeekly.w1;

public class rotateArray {

    public static void rotate01(int[] arr, int k) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[(i + k) % arr.length] = arr[i]; // main logic
        }
        for (int j = 0; j < ans.length; j++) {
            System.out.print(ans[j] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int k = 4;
        rotate01(arr, k);
    }
}
