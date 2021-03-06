package hackerrank;

import java.util.Stack;

/**
 * Created by virus on 06/01/16.
 */
public class Tree_Postorder_Traversal {

    class Node {
        int data;
        Node left;
        Node right;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    void postOrder1(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);

        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().data);
        }
    }

    void postOrder(Node root) {
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Tree_Postorder_Traversal t = new Tree_Postorder_Traversal();

        Node cl2 = t.new Node();
        cl2.data = 1;

        Node cl11 = t.new Node();
        cl11.data = 4;

        Node cl1 = t.new Node();
        cl1.data = 5;
        cl1.right = cl11;
        cl1.left = cl2;

        Node c = t.new Node();
        c.data = 6;

        Node cr1 = t.new Node();
        cr1.data = 2;
        cr1.left = c;

        Node root = t.new Node();
        root.data = 3;
        root.left = cl1;
        root.right = cr1;


        t.postOrder(root);
        System.out.println();
        t.postOrder1(root);
    }
}
