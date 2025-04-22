package ArraysStrings;

public class validPalindrome {
    public static void main(String[] args) {
        String s = "bobbob";
        System.out.println(isPalindrome(s));
        //find all substrings that are palindrome
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String substr = s.substring(i,j);
                if(isPalindrome(substr)){
                    System.out.println(substr);
                }
            }
        }
    }
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}