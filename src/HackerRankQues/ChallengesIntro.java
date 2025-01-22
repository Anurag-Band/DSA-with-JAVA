package HackerRankQues;

import java.util.*;

public class ChallengesIntro {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();

        ArrayList <Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int value = in.nextInt();
            arr.add(value);
        }

        int idx = 0;

        for (int i = 0; i < n; i++){
            if(arr.get(i) == v){
                idx = i;
                break;
            }
        }

        System.out.print(idx);

    }
}
