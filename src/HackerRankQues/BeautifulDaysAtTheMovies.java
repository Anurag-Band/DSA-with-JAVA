package HackerRankQues;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();

        int count = 0;

        for (int m = i; m <= j; m++) {
            int original = m;
            int reverse = 0;

            int temp = m;
            while (temp != 0) {
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }

            if (Math.abs(original - reverse) % k == 0) {
                count++;
            }
        }

        System.out.print(count);
    }
}
