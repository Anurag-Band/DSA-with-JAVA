package HackerRankQues;

import java.util.Scanner;

public class FindDigits {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++){
            int count = 0;
            int num = numbers[i];

            while(num != 0){
                int rem = num % 10;
                if(rem != 0 && numbers[i] % rem == 0){
                    count++;
                }
                num = num / 10;
            }
            System.out.println(count);
        }

    }
}
