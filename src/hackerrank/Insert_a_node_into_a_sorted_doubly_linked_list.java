package hackerrank;

/**
 * Created by virus on 06/01/16.
 */
public class Insert_a_node_into_a_sorted_doubly_linked_list {

    class Node {
        int data;
        Node next;
        Node prev;

        /*@Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }*/
    }

    Node SortedInsert(Node head,int data) {
        Node temp = new Node();
        temp.data = data;
        if(head == null) {
            return temp;
        } else {
            Node node = head;
            while(node != null) {
                if(node.data >= data) {
                    temp.prev = node.prev;
                    temp.next = node;
                    node.prev = temp;
                    if(temp.prev == null) {
                        return temp;
                    } else {
                        temp.prev.next = temp;
                        return head;
                    }
                }
                if(node.next == null) {
                    temp.prev = node;
                    node.next = temp;
                    break;
                }

                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Insert_a_node_into_a_sorted_doubly_linked_list i = new Insert_a_node_into_a_sorted_doubly_linked_list();

        Node head = i.new Node();
        head.data = 2;

        head.next = i.new Node();
        head.next.data = 4;
        head.prev = head;

        head = i.SortedInsert(head, 3);


        System.out.println(head);
    }
}
