package hackerrank;

/**
 * Created by virus on 06/01/16.
 */
public class Insert_a_Node_at_Tail {
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

    Node InsertAtTail(Node head, int data) {
        Node temp = new Node();
        temp.data = data;

        if(head == null) {
            head = temp;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = temp;
        }
        return head;
    }

    public static void main(String[] args) {

        int n1 = 1;
        int maxD = (int)Math.sqrt(n1);
        int sum=0;
        for(int i = 1; i <= maxD; i++) {
            if(n1 % i == 0) {
                sum += i;
                sum += n1/i;
            }
        }

        System.out.println(sum);
        Insert_a_Node_at_Tail i = new Insert_a_Node_at_Tail();
        Node n = i.new Node(); n.data = 3;
        n.next = i.new Node(); n.next.data = 2;
        Node node = i.InsertAtTail(n, 1);
        System.out.println(node);
    }
}
