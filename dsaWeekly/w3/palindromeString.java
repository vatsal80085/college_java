package dsaWeekly.w3;

public class palindromeString {
    public static boolean isPalindrome(String s) {
        String tempString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = "";
        for (int i = tempString.length() - 1; i >= 0; i--) {
            reverse += tempString.charAt(i);
        }
        return reverse.equals(tempString);
    }

    public static void main(String[] args) {
        String s = "bob";
        System.out.println(isPalindrome(s));
    }

}
