package HackerRankQues;

import java.util.Scanner;

public class BithdayCakeCandles {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++){
            if(arr[i] == max){
                count++;
            }
        }

        System.out.println(count);
    }
}
