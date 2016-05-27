package hackerrank;

/**
 * Created by virus on 05/27/16.
 */
public class Print_In_Reverse {
    class Node {
        int data;
        Node next;
    }

    void ReversePrint(Node head) {
        StringBuilder stb = new StringBuilder();
        while(head != null) {
            stb.insert(0, head.data+"\n");
            head = head.next;
        }
        System.out.print(stb);
    }

    public static void main(String[] args) {
        Print_In_Reverse p = new Print_In_Reverse();
        //1 --> 2 --> NULL
        //2 --> 1 --> 4 --> 5 --> NULL
        Node node = p.new Node();
        node.data = 1;
        node.next = p.new Node();
        node.next.data = 2;

        p.ReversePrint(node);
    }
}
