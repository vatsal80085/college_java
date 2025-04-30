package dsaWeekly.w1;

public class minmax {

    public static int findMin(int[] arr) {

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.min(ans, arr[i]);
        }
        return ans;
    }

    public static int findMax(int arr[]) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 43, 21, 546, 221 };
        System.out.println("The smallest element is: " + findMin(arr));
        System.out.println("The largest element is: " + findMax(arr));
    }
}