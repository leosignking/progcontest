package hackerrank;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by sredreddy on 4/20/2016.
 */
public class Java_1D_Array_Part_2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0; j<arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(isGame(n,m,arr) ? "YES" : "NO");

        }
    }

    static boolean isGame(int n, int m, int[] arr) {
        Queue<Integer> q=new ArrayDeque<Integer>();
        q.add(0);
        arr[0]=1;
        for(;!q.isEmpty();){
            int cur=q.poll();
            int[] x=new int[]{1,-1,m};
            for(int d: x){
                int nxt=cur+d;
                if(nxt>=n)return true;
                if(nxt>0&&arr[nxt]==0){
                    q.add(nxt);
                    arr[nxt]=1;
                }
            }
        }
        return false;
    }




}
