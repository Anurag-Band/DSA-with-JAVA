package HackerRankQues;

import java.util.*;

public class SherlockAndArray {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++){
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            int totalSum = 0;

            for (int j = 0; j < n; j++){
                totalSum += arr[j];
            }

            int currSum = 0;
            boolean isElemFound = false;

            for (int j = 0; j < n; j++){
                currSum += arr[j];

                if(currSum == totalSum){
                    isElemFound = true;
                    break;
                }
                totalSum -= arr[j];

            }

            if(isElemFound){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
