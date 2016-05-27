package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 05/27/16.
 */
public class Insert_a_Node_Nth_Position {

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

    Node InsertNth(Node head, int data, int position) {
        if(position == 0) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            return node;
        } else {
            int counter = 0;
            Node node = head;
            while (node != null){
                counter++;
                if(counter == position) {
                    Node temp = node.next;
                    node.next = new Node();
                    node.next.data = data;
                    node.next.next = temp;
                    break;
                }else
                    node = node.next;
            }
            return head;
        }
        /*Node node = head;
        if (position == 0){
            node = new Node();
            node.data = data;
            node.next = head;
            return node;
        }
        else {
            while(--position > 0){
                node = node.next;
            }
            Node i = node.next;
            node.next = new Node();
            node.next.data = data;
            node.next.next = i;
            return head;
        }*/
    }

    public static void main(String[] args) {
        //NULL, data = 3, position = 0
        //3 --> NULL, data = 4, position = 0
        Insert_a_Node_Nth_Position i = new Insert_a_Node_Nth_Position();
        Node n = i.new Node(); n.data = 3;
        n.next = i.new Node(); n.next.data = 2;
        Node node = i.InsertNth(n, 1, 1);
        System.out.println(node);
    }
}
