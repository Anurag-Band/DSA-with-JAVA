package HackerRankQues;

import java.util.*;

public class MarkAndToys {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int budget = in.nextInt();
        ArrayList <Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int value = in.nextInt();
            prices.add(value);
        }
        Collections.sort(prices);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++){
            if(sum + prices.get(i) <= budget){
                sum += prices.get(i);
                count++;
            } else {
                break;
            }
        }

        System.out.print(count);


    }
}
