package dsaWeekly.w2;

import java.util.Arrays;

public class removeDuplicate {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = { 43, 23, 43, 21, 546, 221 };
        Arrays.sort(arr);
        removeDuplicates(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
