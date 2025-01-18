package HackerRankQues;

import java.util.*;

public class CircularArrayRotation {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        ArrayList<Integer> queries = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            queries.add(in.nextInt());
        }

        for (int i = 0; i < q; i++) {
            int lastElem = a.get(n - 1);
            a.remove(n - 1);
            a.add(0, lastElem);
        }

        for (int i = 0; i < k; i++) {
            int queryIndex = queries.get(i);
            System.out.println(a.get(queryIndex));
        }

    }
}
