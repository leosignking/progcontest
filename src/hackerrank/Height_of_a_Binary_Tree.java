package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 06/03/16.
 */
public class Height_of_a_Binary_Tree {
    class Node {
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    public Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Height_of_a_Binary_Tree h = new Height_of_a_Binary_Tree();
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=h.insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }

    static int getHeight(Node root) {
        if(root == null) return -1;

        int l = getHeight(root.left);
        int r = getHeight(root.right);
        if(l>r) return l+1;
        else return r+1;
    }
}
