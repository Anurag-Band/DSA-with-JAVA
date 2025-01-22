package HackerRankQues;

import java.util.Scanner;

public class InsertionSortPartTwo {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        for(int i=0; i<n-1; i++){
            int j = i + 1;

            while(j>0){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }else {
                    break;
                }
            }

            for(int k=0; k<n; k++){
                System.out.print(arr[k] + " ");
            }

            System.out.println();

        }


    }
}
