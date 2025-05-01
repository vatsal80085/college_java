package dsaWeekly.w2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSumQ {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length - 2; i++){
            int j=i + 1;
            int k= nums.length - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        list.addAll(set);
        return list;
    }
    public static void main(String[] args) {
        int[] arr ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
}
