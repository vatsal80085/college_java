import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {

    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public void Ctree() {
        this.root = creatTree();
    }

    private Node creatTree() {

        Node nn = new Node();
        int item = sc.nextInt();
        nn.val = item;

        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = creatTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = creatTree();
        }
        return nn;
    }

    public void display() {
        display(root);
    }

    private void display(Node root) {
        if (root == null) {
            return;
        }
        String s = "";
        s = s + root.val;
        s = "<--" + s + "-->";

        if (root.left != null) {
            s = root.left.val + s;
        } else {
            s = "." + s;
        }

        if (root.right != null) {
            s = s + root.right.val;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        display(root.left);
        display(root.right);
    }

    public boolean find(int target) {
        return find(root, target);
    }

    private boolean find(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            return true;
        }
        boolean left = find(root.left, target);
        boolean right = find(root.right, target);
        return left || right;
    }

    public int findMax() {
        return max(root);
    }

    private int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int lmax = max(root.left);
        int rmax = max(root.right);
        return Math.max(root.val, Math.max(lmax, rmax));
    }

    public int findMin() {
        return min(root);
    }

    private int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int lmin = min(root.left);
        int rmin = min(root.right);
        return Math.min(root.val, Math.min(lmin, rmin));
    }

    public Node getRoot() {
        return root;
    }

    public int countNodes() {
        return count(root);
    }

    private int count(Node root) {
        if (root == null) {
            return 0;
        }
        return count(root.left) + count(root.right) + 1;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + "-->");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + "-->");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + "-->");
    }

    // bfs uses queue
    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> qt = new LinkedList<>();
        qt.add(root);
        qt.add(null);
        while (!qt.isEmpty()) {
            Node curr = qt.remove();
            if (curr == null) {
                System.out.println();
                if (qt.isEmpty()) {
                    break;
                } else {
                    qt.add(null);
                }
            } else {
                System.err.print(curr.val + " ");
                if (curr.left != null) {
                    qt.add(curr.left);
                }
                if (curr.right != null) {
                    qt.add(curr.right);
                }

            }
        }
    }
}