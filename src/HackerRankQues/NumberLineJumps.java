package HackerRankQues;

import java.util.Scanner;

public class NumberLineJumps {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if (v1 <= v2){
            System.out.print("NO");
            return;
        }

        if ((x2-x1)%(v2-v1) == 0){
            System.out.print("YES");
        } else{
            System.out.print("NO");
        }

    }
}
