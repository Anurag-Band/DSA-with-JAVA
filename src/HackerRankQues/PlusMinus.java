package HackerRankQues;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n ;
        n = in.nextInt();

        int [] arr;
        arr = new int[n];

        float pos = 0;
        float neg = 0;
        float zero = 0;

        // Populate the array
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (arr[i] > 0){
                pos += 1;
            } else if (arr[i] < 0){
                neg += 1;
            } else if (arr[i] == 0){
                zero += 1;
            }

        }

        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);


    }
}
