package Hashmaps;

import java.util.HashMap;

public class first {
    public static void main(String[] args) {
        HashMap<String, Integer> population = new HashMap<>();// initialize
        //adding , getting, searching in HashMap is O(1)
        // add
        population.put("India", 150);
        population.put("China", 140);
        population.put("USA", 40);
        population.put("Nepal", 05);
        population.put("Australia", 07);

        // get
        System.out.println(population.get("India"));
        System.out.println(population.get("USA"));

        // check whether contains key
        System.out.println(population.containsKey("USA"));
        // check whether contains value
        System.out.println(population.containsValue(140));

        // traversing on keys O(n)
        for (String s : population.keySet()) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println(population.size());

    }
}
