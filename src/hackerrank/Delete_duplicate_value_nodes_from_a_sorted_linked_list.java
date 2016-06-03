package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 05/27/16.
 */
public class Delete_duplicate_value_nodes_from_a_sorted_linked_list {

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

    Node RemoveDuplicates(Node head) {
        Node node = head;
        while(node != null) {
            if(node.next != null) {
                if(node.data >= node.next.data) {
                    node.next = node.next.next;
                } else
                    node = node.next;
            }else
                node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Delete_duplicate_value_nodes_from_a_sorted_linked_list d = new Delete_duplicate_value_nodes_from_a_sorted_linked_list();

        //1 1 1 1 1 1 1
        Node head = d.new Node();
        head.data = 1;
        head.next = d.new Node();
        head.next.data = 1;
        head.next.next = d.new Node();
        head.next.next.data = 1;
        head.next.next.next = d.new Node();
        head.next.next.next.data = 1;
        head.next.next.next.next = d.new Node();
        head.next.next.next.next.data = 1;
        head.next.next.next.next.next = d.new Node();
        head.next.next.next.next.next.data = 1;
        head.next.next.next.next.next.next = d.new Node();
        head.next.next.next.next.next.next.data = 1;

        head = d.RemoveDuplicates(head);
        System.out.println(head);
    }
}
