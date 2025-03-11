package dsaPractice;

import java.util.Scanner;

public class q2 {

    public static void rotateArray(int[] nums, int d) {
        int numberOfRotations = d % nums.length;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        rotateArray(nums, d);
        sc.close();
    }
}
