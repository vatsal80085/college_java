import java.util.Arrays;

public class streamsinJava {

    public static void main(String[] args) {
        int[] arr = {1, 232, 43, 32, 122, 2231, 4343, 434, 675, 5554};

        int oddsum = Arrays.stream(arr)
                           .filter(ele -> ele % 2 != 0) // Filter odd numbers
                           .sum();                     // Sum of odd numbers

        System.out.println("Odd sum= " + oddsum);

        String strarr[] = {"54", "23", "12", "122", "32"};

        int add3mul = Arrays.stream(strarr)
            .mapToInt(Integer::parseInt)
            .filter(var -> var%3 == 0)
            .sum();
        System.out.println("Add3Mul = " + add3mul );

        int max = Arrays.stream(arr).max().orElse(-1);
        int min = Arrays.stream(arr).min().orElse(-1);
        System.out.println(max);
        System.out.println(min);
    }
}