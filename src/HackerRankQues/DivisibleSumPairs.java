package HackerRankQues;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleSumPairs {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();

            ArrayList<Integer>ar=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                int value=in.nextInt();
                ar.add(value);
            }


            int count = 0;

            for (int i=0;i<ar.size();i++){
                for (int j=i+1;j<ar.size(); j++){
                    int sum = ar.get(i) + ar.get(j);
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }

            System.out.print(count);


        }
}
