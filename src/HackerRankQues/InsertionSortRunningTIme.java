package HackerRankQues;

import java.util.Scanner;

public class InsertionSortRunningTIme {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int count = 0;

        for(int i=0; i<n-1; i++){
            int j = i + 1;

            while(j>0){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                    count++;
                }else {
                    break;
                }
            }
        }
        System.out.print(count);

    }
}
