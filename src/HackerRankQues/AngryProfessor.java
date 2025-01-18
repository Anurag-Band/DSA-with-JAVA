package HackerRankQues;

import java.util.Scanner;

public class AngryProfessor {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            int t = in.nextInt();

            for (int i = 0; i < t; i++){
                int n = in.nextInt();
                int k = in.nextInt();

                int [] a = new int[n];

                for (int j = 0; j < n; j++){
                    a[j] = in.nextInt();
                }

                int count = 0;

                for (int m = 0; m < a.length; m++){
                    if (a[m] <= 0) count++;
                }

                if (count >= k) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }

            }

        }
}
