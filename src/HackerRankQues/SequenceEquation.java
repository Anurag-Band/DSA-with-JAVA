package HackerRankQues;

import java.util.*;

public class SequenceEquation {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=1;i<=n;i++){
            int value=in.nextInt();
            mp.put(value,i);
        }
        for(int i=1;i<=n;i++){
            int x=mp.get(i);
            int y=mp.get(x);
            System.out.println(y);
        }

    }
}
