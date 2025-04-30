package dsaWeekly.w1;

public class buynsell {
    public static int maxProfit(int[] arr) {
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minprice = Math.min(minprice, arr[i]);
            maxprofit = Math.max(maxprofit, arr[i] - minprice);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 6, 4, 3, 1, 5 };
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
