package HackerRankQues;

import java.util.*;

public class MigratoryBirds {
        public static void main(String args[]) {

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            ArrayList<Integer>arr=new ArrayList<>();

            HashMap<Integer, Integer> hmp = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int value = scanner.nextInt();
                arr.add(value);
                int g = hmp.getOrDefault(arr.get(i), 0);
                hmp.put(arr.get(i), g  + 1);
            }

            int mx=0;
            int ans=0;
            for(Integer key:hmp.keySet()){
                int value=hmp.get(key);
                if(value>mx){
                    mx=value;
                    ans=key;
                }
            }
            System.out.println(ans);
        }
}
