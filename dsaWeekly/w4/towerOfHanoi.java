package dsaWeekly.w4;

public class towerOfHanoi {
    public static int movesfortowerofHanoi(int n) {
        // Your code here
        return (int) Math.pow(2, n) - 1;
    }

    public static void TowerOfHanoi(int n, String source, String destination, String helper) {
        if (n <= 0)
            return;
        else {
            TowerOfHanoi(n - 1, source, helper, destination);
            System.out.println("Disk " + n + " moved from " + source + " to " + destination);
            TowerOfHanoi(n - 1, helper, destination, source);
        }

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(movesfortowerofHanoi(n));
        TowerOfHanoi(n, "Source", "Destination", "Helper");
    }
}
