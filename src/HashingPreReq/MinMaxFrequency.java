package HashingPreReq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinMaxFrequency {
    public static void main(String args []){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int value = in.nextInt();
            arr.add(value);
        }

        Map<Integer,Integer> hmp = new HashMap<>();
        for (int i = 0; i < n; i++){
            int value = hmp.getOrDefault(arr.get(i), 0);
            hmp.put(arr.get(i), value + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int maxElem = arr.get(0);
        int minFreq = Integer.MAX_VALUE;
        int minElem = arr.get(0);

        for (Map.Entry<Integer, Integer> num : hmp.entrySet()){
          if(num.getValue() >= maxFreq){
              maxFreq = num.getValue();
              maxElem = num.getKey();
          }
          if(num.getValue() <= minFreq){
              minFreq = num.getValue();
              minElem = num.getKey();
          }
        }

        System.out.println(maxElem + " " + maxFreq);
        System.out.println(minElem + " "  + minFreq);


    }
}
