public class backtracking {
    //print n to 1
    public static void printNto1(int i, int n){
        if(i>n) return;
        printNto1(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n = 4;
        printNto1(1, n);
        // int tq = 2;
        // boolean[] box = new boolean[n];
        // queen(n, tq, 0, box, "");

    }

    public static void queen(int n, int tq, int qpsf, boolean[] box, String ans) {
        if (qpsf == tq) {
            System.err.println(ans);
            return;
        }
        for (int i = 0; i < box.length; i++) {
            if (box[i] == false) {
                box[i] = true;
                queen(n, tq, qpsf + 1, box, ans + "b" + i + "q" + qpsf);
                box[i] = false;// backtracking
            }
        }
    }

}