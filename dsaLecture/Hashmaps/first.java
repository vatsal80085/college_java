package Hashmaps;

import java.util.HashMap;


public class first {
    public static void main(String[] args) {
        HashMap<String, Integer> population = new HashMap<>();//initialize

        //add
        population.put("India", 150);
        population.put("China", 140);
        population.put("USA", 40);
        population.put("Nepal", 05);
        population.put("Australia", 07);

        //get
        System.out.println(population.get("India"));
        System.out.println(population.get("USA"));

        
    }
}
