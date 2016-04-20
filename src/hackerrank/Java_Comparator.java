package hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by sredreddy on 4/20/2016.
 */

class Player{
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player>{

    @Override
    public int compare(Player p1, Player p2) {
        if(p1.score == p2.score)
            return p1.name.toLowerCase().compareTo(p2.name.toLowerCase());
        else if(p1.score > p2.score) return -1;
        return 1;
    }
}
public class Java_Comparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Player player[] = new Player[n];
        Checker checker = new Checker();

        for (int i=0; i<n; i++) {
            player[i] = new Player(scanner.next(), scanner.nextInt());
        }
        scanner.close();

        Arrays.sort(player, checker);
        for(Player p : player) {
            System.out.printf("%s %s\n",p.name, p.score);
        }
    }
}
