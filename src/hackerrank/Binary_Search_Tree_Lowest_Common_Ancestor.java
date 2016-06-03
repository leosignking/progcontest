package hackerrank;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by virus on 06/02/16.
 */
public class Binary_Search_Tree_Lowest_Common_Ancestor {

    class Node {
        int data;
        Node left;
        Node right;
    }

    //http://stackoverflow.com/questions/31409989/what-is-the-best-approach-binary-search-tree-lowest-common-ancestor-using-onl
    static Node lca(Node root, int v1, int v2) {
        if (root == null) return null;
        if (v1 > v2) {
            int temp = v2;
            v2 = v1;
            v1 = temp;
        }
        while (root.data < v1 || root.data > v2) {
            if (root.data < v1) root = root.right;
            else if (root.data > v2) root = root.left;
        }
        return root;
    }

    static Node lca1(Node root, int v1, int v2) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if(node.left != null) {
                if(node.left.data == v1 || node.right.data == v2) {
                    root = node;
                    break;
                }else queue.add(node.left);
            }
            if(node.right != null) {
                if(node.left.data == v1 || node.right.data == v2) {
                    root = node;
                    break;
                }else queue.add(node.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Binary_Search_Tree_Lowest_Common_Ancestor b = new Binary_Search_Tree_Lowest_Common_Ancestor();

        Node root = b.new Node();
        root.data = 4;

        root.left = b.new Node();
        root.left.data = 2;
        root.left.left = b.new Node();
        root.left.left.data = 1;
        root.left.right = b.new Node();
        root.left.right.data = 3;

        root.right = b.new Node();
        root.right.data = 7;
        root.right.left = b.new Node();
        root.right.left.data = 6;

        Node node = lca(root, 1, 7);
        System.out.println(node.data);

        System.out.println(lca1(root, 1, 7).data);
    }
}
