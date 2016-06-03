package hackerrank;

/**
 * Created by virus on 05/27/16.
 */
public class Merge_two_sorted_linked_lists {
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

    Node MergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if(headA == null) return headB;
        else if(headB == null) return headA;
        if (headA.data < headB.data){
            headA.next = MergeLists(headA.next, headB);
            return headA;
        }
        else {
            headB.next = MergeLists(headA, headB.next);
            return headB;
        }

    }

    public static void main(String[] args) {
        Merge_two_sorted_linked_lists m = new Merge_two_sorted_linked_lists();
        //1 -> 3 -> 5 -> 6 -> NULL
        //2 -> 4 -> 7 -> NULL

        //15 -> NULL
        //12 -> NULL

        //        NULL
        //1 -> 2 -> NULL

        Node nodeA = m.new Node();
        nodeA.data = 15;
        Node nodeB = m.new Node();
        nodeB.data = 1;
        nodeB.next = m.new Node();
        nodeB.next.data = 2;

        Node node = m.MergeLists(nodeA, nodeB);
        System.out.println(node);
    }
}
