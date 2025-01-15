package HackerRankQues;

import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] scores = new int[n];

        for (int i = 0; i < n; i++){
            scores[i] = in.nextInt();
        }

        int leastScore = scores[0];
        int mostScore = scores[0];

        int mostScoreBreakCount = 0;
        int leastScoreBreakCount = 0;

        for (int i = 0; i < scores.length; i++){
            if(scores[i] > mostScore){
                mostScore = scores[i];
                mostScoreBreakCount++;
            }

            if(scores[i] < leastScore){
                leastScore = scores[i];
                leastScoreBreakCount++;
            }


        }

        System.out.print(mostScoreBreakCount + " " + leastScoreBreakCount);

    }
}
