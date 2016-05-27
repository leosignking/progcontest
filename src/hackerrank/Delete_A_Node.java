package hackerrank;

/**
 * Created by virus on 05/27/16.
 */
public class Delete_A_Node {
    class Node {
        int data;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    Node Delete(Node head, int position) {
        Node node = head;
        if(position == 0) {
            return node.next;
        }
        while (--position>0) {
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }

    public static void main(String[] args) {
        Delete_A_Node d = new Delete_A_Node();

        Node node = d.new Node();
        node.data = 1;
        node.next = d.new Node();
        node.next.data = 2;
        node.next.next = d.new Node();
        node.next.next.data = 3;
        node.next.next.next = d.new Node();
        node.next.next.next.data = 4;

        Node head = d.Delete(node, 3);
        System.out.println(head);
    }
}
