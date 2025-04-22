package stacks;
import java.util.Stack;
public class next_element {
    public static void main(String[] args) {
        
        int[] arr={4,1,2,5,6,10,7,8};
        NGER(arr);
    }

    //leetcode 496
    //leetcode trapping water


    //leetcode 739 incomplete yet this logical implementation is to be used
    public static void NGERleet(int[] arr){

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){

            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.peek()]=st.peek();
                st.pop();
            }
            st.push(i);

        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    
    //next greater element on right; implementation using stack; Time Complexity: O(n)  
    public static void NGER(int[] arr){

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){

            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);

        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
