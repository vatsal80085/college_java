package dsaWeekly.w1;

import java.util.ArrayList;
import java.util.List;

public class pascaltriangle {
    public static void main(String[] args) {
        int numRows = 6;

        List<List<Integer>> result = new ArrayList<>();
        // edge case 1
        if (numRows == 0)
            System.out.println(result);

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        // edge case 2
        if (numRows == 1)
            System.out.println(result);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            row.add(1);
            result.add(row);
        }
        System.out.println(result);
    }
}
