package hackerrank;

/**
 * Created by virus on 05/27/16.
 */
public class Reverse_A_Linked_List {

    class Node {
        int data;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", node=" + next +
                    '}';
        }
    }

    Node Reverse(Node head) {
        if(head == null) return head;
        else {
            Node pNode = null;
            Node nNode = null;
            while(head !=null) {
                nNode = head.next;
                head.next = pNode;
                pNode = head;
                head = nNode;
            }
            return pNode;
        }
    }

    public static void main(String[] args) {
        Reverse_A_Linked_List r = new Reverse_A_Linked_List();
        Node head = r.new Node();
        head.data = 1;
        head.next = r.new Node();
        head.next.data = 2;
        head.next.next = r.new Node();
        head.next.next.data = 3;

        head = r.Reverse(head);
        System.out.println(head);
    }

}
