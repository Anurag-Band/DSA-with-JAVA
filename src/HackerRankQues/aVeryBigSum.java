package HackerRankQues;
import java.util.Scanner;


public class aVeryBigSum {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);

        int n ;
        n = in.nextInt();
        long [] arr;
        arr = new long[n];

        for(int i = 0 ;i < n ; i++){
            arr[i] = in.nextInt();
        }

        long sum = 0;

        for (int i = 0; i < n; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
