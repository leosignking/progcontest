package hackerrank;

/**
 * Created by virus on 06/02/16.
 */
public class Tree_Top_View {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void printLeftNode(Node leftNode) {
        if(leftNode == null) return;
        printLeftNode(leftNode.left);
        System.out.print(leftNode.data+" ");
    }

    void printRightNode(Node rightNode) {
        if(rightNode == null) return;
        System.out.print(rightNode.data+" ");
        printRightNode(rightNode.right);

    }
    void top_view(Node root) {
        Node leftNode = root.left;
        Node rightNode = root.right;

        printLeftNode(leftNode);
        System.out.print(root.data+" ");
        printRightNode(rightNode);

    }

    public static void main(String[] args) {
        Tree_Top_View t = new Tree_Top_View();

        Node ll2 = t.new Node();
        ll2.data = 1;
        ll2.right = t.new Node();
        ll2.right.data = 9;

        Node lr2 = t.new Node();
        lr2.data = 4;

        Node ll1 = t.new Node();
        ll1.data = 5;

        ll1.left = ll2;
        ll1.right = lr2;

        Node rl1 = t.new Node();
        rl1.data = 6;

        Node rr1 = t.new Node();
        rr1.data = 7;
        rr1.left = t.new Node();
        rr1.left.data = 8;

        Node lr1 = t.new Node();
        lr1.data = 2;
        lr1.left = rl1;
        lr1.right = rr1;

        Node root = t.new Node();
        root.data = 3;

        root.left =ll1;
        root.right = lr1;

        t.top_view(root);
    }
}
