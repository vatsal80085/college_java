public class TreeClient {
    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println("Enter tree data:");
        tree.Ctree();

        System.out.println("\nTree Display:");
        tree.display();

        System.out.println("\nInorder:");
        tree.inOrder(tree.getRoot());

        System.out.println("\n\nPreorder:");
        tree.preOrder(tree.getRoot());

        System.out.println("\n\nPostorder:");
        tree.postOrder(tree.getRoot());

        System.out.println("\n\nLevel Order:");
        tree.levelOrder(tree.getRoot());

        System.out.println("\n\nFind 50: " + tree.find(50));
        System.out.println("Max value: " + tree.findMax());
        System.out.println("Min value: " + tree.findMin());
        System.out.println("Total nodes: " + tree.countNodes());
    }

    // public static void main(String[] args) {
    // Tree tt = new Tree();

    // tt.Ctree();
    // // tt.display();
    // tt.inOrder(tt.getRoot());
    // System.out.println();
    // tt.postOrder(tt.getRoot());

    // System.out.println(tt.find(170));
    // // 10 true 20 false true 30 false false true 50 true 60 false false f `alse
    // System.out.println(tt.findMax());
    // System.out.println(tt.findMin());
    // System.out.println(tt.countNodes());
    // // bfs uses queue
    // // sfs uses stack
    // }
}
