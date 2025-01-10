package HackerRankQues;
import java.util.Scanner;
import java.util.ArrayList;

public class CompareTheTriplets {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a ;
        int b ;
        int c ;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        ArrayList<Integer> alice = new ArrayList<Integer>();
        alice.add(a);
        alice.add(b);
        alice.add(c);

        int m;
        int n;
        int p;
        m = in.nextInt();
        n = in.nextInt();
        p = in.nextInt();
        ArrayList<Integer> bob = new ArrayList<Integer>();
        bob.add(m);
        bob.add(n);
        bob.add(p);

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < alice.size(); i++){
            if(alice.get(i)>bob.get(i)){
                aliceScore += 1;
            } else if(alice.get(i)<bob.get(i)){
                bobScore += 1;
            }
        }

        System.out.print(aliceScore + " " + bobScore);

    }
}
