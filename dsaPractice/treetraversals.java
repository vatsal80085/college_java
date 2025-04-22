package dsaPractice;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class treetraversals {

    public static int maxOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftmax = maxOfNodes(root.left);
        int rightmax = maxOfNodes(root.right);
        int maxelem = Math.max(root.val, Math.max(leftmax, rightmax));
        return maxelem;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);
        return leftsum + rightsum + root.val;
    }

    public static int sizeOftree(Node root) {
        if (root == null) {
            return 0;
        }
        // total no. of nodes

        int leftcount = 0;
        int rightcount = 0;
        leftcount = sizeOftree(root.left);
        rightcount = sizeOftree(root.right);
        return leftcount + rightcount + 1;
    }

    // L N R
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Max of Nodes: " + maxOfNodes(root));
        System.out.println("Sum of Nodes: " + sumOfNodes(root));
        System.out.println("Size of Tree: " + sizeOftree(root));
        System.out.println("InOrder Traversal:");
        inOrder(root);
    }
}
