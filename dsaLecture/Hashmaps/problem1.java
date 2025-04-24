package Hashmaps;

import java.util.HashMap;

public class problem1 {
    public static void highestFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch) == true) {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int maxval = 0;
        char maxchar = 'a';
        for (char c : map.keySet()) {
            if (map.get(c) > maxval) {
                maxval = map.get(c);
                maxchar = c;
            }
        }
        System.out.println(maxchar);
    }

    public static void main(String[] args) {
        highestFrequency("MonkeyDLuffy");
    }
}
