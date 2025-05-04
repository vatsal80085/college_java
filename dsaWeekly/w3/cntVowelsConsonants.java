package dsaWeekly.w3;

public class cntVowelsConsonants {

    public static int vowelCount(String str) {
        String s = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int consonantCount(String str) {
        String s = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Basdfgob";
        System.out.println(vowelCount(s));
        System.out.println(consonantCount(s));
    }
}
