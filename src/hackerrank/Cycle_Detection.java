package hackerrank;

/**
 * Created by virus on 06/01/16.
 */
public class Cycle_Detection {

    class Node {
        int data;
        Node next;
    }


    boolean hasCycle(Node head) {
        if(head == null) return false;
        Node node = head;
        Node nextNode = head.next;
        while(node != null && node.next != null) {
            if(node == nextNode) {
                return true;
            }
            node = node.next;
            nextNode = node.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Cycle_Detection c = new Cycle_Detection();

        Node head = c.new Node();
        head.data = 1;

        head.next = c.new Node();
        head.next.data = 2;

        head.next.next = c.new Node();
        head.next.next.data = 3;

        head.next.next.next = head.next;

        System.out.println(c.hasCycle(head));
    }
}
