import java.util.Scanner;

// when a function calls itself again and again until a certain condition is met
// is called recursion
public class recursions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //String ques = "abc";
        String ans = "";
        coin(n, ans);

        // Subs(ques, ans = "");
        // headprint(n);
        // tailprint(n);
        // System.out.println("Factorial of " + n + " is " + factorial(n));
        // int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println(search(arr, 0, n));
        // System.out.println(isSorted(arr, 0));

        // System.out.println(powerTail(5, 3, 1));
        // System.out.println(powerhead(2, 3));
        // System.out.println(fibonacci(n));
        sc.close();
    }

    // three coin problem using recursion, print possibilities hhh, hht, hth, thh,
    // htt, tht, tth, ttt
    public static void coin(int n, String ans) {
        if (n == 0) {
            System.out.print(ans + " ");
            return;
        }
        coin(n - 1, ans + "H");
        coin(n - 1, ans + "T");
    }

    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int count = 0;
        count += countWays(n - 1);
        count += countWays(n - 2);
        count += countWays(n - 3);
        return count;

    }

    // subsequence of a string using recursion
    public static void Subs(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans + "");
            return;
        }
        char ch = ques.charAt(0);
        Subs(ques.substring(1), ans);
        Subs(ques.substring(1), ans + ch);

    }

    // fibonacci sequence using recursion
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fibonacci(n - 1);
        int f2 = fibonacci(n - 2);
        return f1 + f2;
    }

    // power of a number using head recursion
    public static int powerhead(int a, int b) {
        // base case
        if (b == 0) {
            return 1;
        }
        int sp = powerhead(a, b - 1);// smaller problem
        int self = sp * a;// self work
        return self;
    }

    // power of a number using tail recursion
    public static int powerTail(int a, int b, int ans) {
        // base case
        if (b == 0) {
            return ans;
        }
        return powerTail(a, b - 1, ans * a);
    }

    // fibonacci series using recursion

    // check if array is sorted or not using recursion
    public static boolean isSorted(int[] arr, int index) {
        // base case
        if (index == arr.length - 1) {
            return true;
        }
        // self work
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // smaller problem
        return isSorted(arr, index + 1);
    }

    // find element in array using recursion
    public static boolean search(int[] arr, int index, int target) {
        // base case
        if (index == arr.length) {
            return false;
        }
        // self work
        if (arr[index] == target) {
            return true;
        }
        // smaller problem
        return search(arr, index + 1, target);
    }

    public static int factorial(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        int sp = factorial(n - 1);// smallest problem
        int self = sp * n;// self work
        return self;
    }

    // print 10 to 1 using recursion
    public static void tailprint(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        tailprint(n - 1);
    }

    // print 1 to 10 using recursion
    public static void headprint(int n) {
        if (n == 0) {
            return;
        }
        headprint(n - 1);
        System.out.println(n);
    }
}