package HackerRankQues;

import java.util.Scanner;

public class HalloweenSale {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int p=in.nextInt();
        int d=in.nextInt();
        int m=in.nextInt();
        int b=in.nextInt();
        int sum=p;
        int count=0;
        while(b>=sum){
            b-=sum;
            count++;
            sum=Math.max(m,sum-d);
        }
        System.out.println(count);

    }
}
