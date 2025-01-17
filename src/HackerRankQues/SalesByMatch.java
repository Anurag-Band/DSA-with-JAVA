package HackerRankQues;

import java.util.*;

public class SalesByMatch {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList <Integer> colors = new ArrayList<Integer>();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++){
            int value = in.nextInt();
            colors.add(value);
            int g = hashMap.getOrDefault(value, 0);
            hashMap.put(value, g + 1);
        }

        int pair = 0;

        for(Integer key:hashMap.keySet()){
            int value=hashMap.get(key);

            pair=pair+(value/2);

        }

        System.out.print(pair);

    }
}
