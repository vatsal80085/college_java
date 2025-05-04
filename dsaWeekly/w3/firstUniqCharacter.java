package dsaWeekly.w3;

import java.util.HashMap;

public class firstUniqCharacter {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }

        return -1;
    }

    public static int firstUniqueCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "bob";
        System.out.println(firstUniqueCharacter(s));
        System.out.println(firstUniqChar(s));// returns index of first character that occurs only once in String
    }
}
