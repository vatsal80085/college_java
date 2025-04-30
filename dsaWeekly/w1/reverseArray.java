package dsaWeekly.w1;

public class reverseArray {

    public static String[] reverse01(String[] arr) {
        String[] ans = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr.length - i - 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        String arr[] = { "Hardwork", "Kills", "Depression" };
        String[] ans = reverse01(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
