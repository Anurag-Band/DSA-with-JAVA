package HackerRankQues;

import java.util.*;

public class BillDivision {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int skippedInd = in.nextInt();

        ArrayList <Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            int value = in.nextInt();
            arr.add(value);
        }

        int brianCharging = in.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++){
            if (i != skippedInd){
                sum += arr.get(i);
            }
        }

        sum = sum / 2;

        if( brianCharging > sum){
            System.out.print(brianCharging-sum);
        } else {
            System.out.print("Bon Appetit");
        }

    }
}
