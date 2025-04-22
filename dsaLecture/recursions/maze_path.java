package recursions;
public class maze_path {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        maze(2, 2, 0, 0, "");
        System.out.println(countMaze(row - 1, col - 1, 0, 0));

    }

    public static int countMaze(int er, int ec, int cr, int cc) {
        if (cr == er && cc == ec) {
            return 1;
        }
        if (cr > er || cc > ec) {
            return 0;
        }
        int count = 0;
        count += countMaze(er, ec, cr, cc + 1);
        count += countMaze(er, ec, cr + 1, cc);
        count += countMaze(er, ec, cr + 1, cc + 1);
        return count;
    }

    public static void maze(int er, int ec, int cr, int cc, String ans) {
        if (cr == er && cc == ec) {
            System.out.println(ans);
            return;
        }
        if (cr > er || cc > ec) {
            return;
        }
        maze(er, ec, cr, cc + 1, ans + "H");
        maze(er, ec, cr + 1, cc, ans + "V");
        maze(er, ec, cr + 1, cc + 1, ans + "D");

    }
}
