package HackerRankQues;

import java.util.*;

public class InsertionSortPartOne {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int temp = arr[arr.length - 1];

        for (int i=arr.length-2;i>=0;i--){
            if(temp >= arr[i]){
                arr[i+1] = temp;
                for(int j=0;j<n;j++){
                    System.out.print(arr[j] + " ");
                }
                break;
            } else {
                arr[i+1] = arr[i];
                for(int j=0;j<n;j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }

        if(temp < arr[0]){
            arr[0] = temp;
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }



    }
}
