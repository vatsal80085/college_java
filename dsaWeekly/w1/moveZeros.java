package dsaWeekly.w1;

public class moveZeros {
    public static void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[j++] = nums[i];
            }
        }
        while (j < nums.length) {
            temp[j++] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 3, 4, 0, 0, 5, 7 };
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
