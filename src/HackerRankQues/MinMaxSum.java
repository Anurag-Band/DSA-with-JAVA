package HackerRankQues;

import java.util.*;

public class MinMaxSum {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        long totalSum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        long minSum = totalSum - max;
        long maxSum = totalSum - min;

        System.out.println(minSum + " " + maxSum);
    }
}
