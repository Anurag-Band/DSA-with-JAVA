package HackerRankQues;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleAndOrange {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);
            int s = in.nextInt();
            int t = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int d1 = in.nextInt();
            int d2 = in.nextInt();
            ArrayList<Integer> apple_d = new ArrayList<Integer>();
            ArrayList<Integer> orange_d = new ArrayList<Integer>();

            for (int i = 0; i < d1; i++) {
                int value = in.nextInt();
                apple_d.add(value);
            }

            for (int i = 0; i < d2; i++) {
                int value = in.nextInt();
                orange_d.add(value);
            }

            int apple_count = 0;
            int orange_count = 0;

            for (int i = 0; i < apple_d.size(); i++) {

                int dist = a + apple_d.get(i);

                if (dist >= s && dist <= t) {
                    apple_count++;
                }
            }

            for (int i = 0; i < orange_d.size(); i++) {

                int dist = b + orange_d.get(i);

                if (dist >= s && dist <= t) {
                    orange_count++;
                }
            }


            System.out.println(apple_count);
            System.out.println(orange_count);
        }
}
