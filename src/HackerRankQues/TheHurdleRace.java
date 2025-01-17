package HackerRankQues;

import java.util.Scanner;

public class TheHurdleRace {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int k = in.nextInt();

            int [] height = new int[n];

            for (int i = 0; i < n; i++){
                height[i] = in.nextInt();
            }

            int max = 0;
            for (int i = 0; i < n; i++){
                if (height[i] > max){
                    max = height[i];
                }
            }

            int maxDoses = 0;

            if (max - k < 0){
                maxDoses = 0;
            } else {
                maxDoses = max - k;
            }

            System.out.print(maxDoses);

        }
}
