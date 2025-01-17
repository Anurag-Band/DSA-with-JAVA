package HackerRankQues;

import java.util.Scanner;

public class ElectronicsShop {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            int b = in.nextInt();
            int n = in.nextInt();
            int m = in.nextInt();

            int [] k = new int[n];
            int [] d = new int[m];

            for (int i = 0; i < n; i++){
                k[i] = in.nextInt();
            }

            for (int i = 0; i < m; i++){
                d[i] = in.nextInt();
            }

            int max_spent = -1;

            for (int i = 0; i < k.length; i++){
                for (int j = 0; j < d.length; j++){
                    int pair = k[i] + d[j];
                    if (pair <= b){
                        max_spent = Math.max(max_spent, pair);
                    }
                }
            }

            System.out.print(max_spent);


        }
}
