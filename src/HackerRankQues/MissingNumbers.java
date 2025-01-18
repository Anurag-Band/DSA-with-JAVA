package HackerRankQues;

import java.util.*;

public class MissingNumbers {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        ArrayList <Integer> arr1 = new ArrayList<>();
        for (int i=0;i<m;i++){
            int value = in.nextInt();
            arr1.add(value);
        }
        int n = in.nextInt();
        ArrayList <Integer> arr2 = new ArrayList<>();
        for (int i=0;i<n;i++){
            int value = in.nextInt();
            arr2.add(value);
        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        HashMap <Integer,Integer> hmp= new HashMap<>();
        for (int i=0;i<arr2.size();i++){
            if(hmp.containsKey(arr2.get(i))){
                hmp.put(arr2.get(i), hmp.get(arr2.get(i)) + 1);
            } else {
                hmp.put(arr2.get(i), 1);
            }
        }

        for (int i=0;i<arr1.size();i++){
            if(hmp.containsKey(arr1.get(i))){
                hmp.put(arr1.get(i), hmp.get(arr1.get(i)) - 1);
            }
        }

        hmp.forEach((key,value)->{
            if(value != 0){
                System.out.print(key + " ");
            }
        });

    }
}
