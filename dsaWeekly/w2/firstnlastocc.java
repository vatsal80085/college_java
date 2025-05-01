package dsaWeekly.w2;

public class firstnlastocc {

    public static int firstocc(int[] arr,int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int lastocc(int[] arr, int target){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,1,4,5};
        System.out.println("first occurence of target is: "+ firstocc(arr, 1));
        System.out.println("last occurence of target is: "+ lastocc(arr, 1));
    }
}
