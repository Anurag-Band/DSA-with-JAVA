package HackerRankQues;

import java.util.Scanner;
import java.util.ArrayList;

public class DiagonalDifference {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        int m;
        n=in.nextInt();
        m=n;

        ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
            for(int j=0;j<m;j++){
                int num=in.nextInt();
                arr.get(i).add(num);
            }
        }


        int leftDigSum = 0;
        int rightDigSum = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (i == j){
                    leftDigSum += arr.get(i).get(j);
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (i + j == n - 1){
                    rightDigSum += arr.get(i).get(j);
                }
            }
        }


        if (leftDigSum > rightDigSum){
            System.out.print(leftDigSum - rightDigSum);
        } else {
            System.out.print(rightDigSum - leftDigSum );
        }

    }
}
