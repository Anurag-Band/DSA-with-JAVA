package HackerRankQues;

import java.util.Scanner;

public class CountingValleys {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            in.nextLine(); // Consume the leftover newline
            String steps = in.nextLine();

            int level = 0;
            int valley_count = 0;

            for (int i = 0; i < steps.length(); i++) {
                if (steps.charAt(i) == 'U') {
                    level++;
                } else if (steps.charAt(i) == 'D') {
                    if (level == 0) {
                        valley_count++;
                    }
                    level--;
                }
            }
            System.out.println(valley_count);

        }
}
