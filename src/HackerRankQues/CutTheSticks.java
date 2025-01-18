package HackerRankQues;

import java.util.*;

public class CutTheSticks {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            arr.add(value);
        }

        while (!arr.isEmpty()) {
            System.out.println(arr.size());

            int shortest = Integer.MAX_VALUE;

            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) < shortest) {
                    shortest = arr.get(j);
                }
            }

            for (int j = arr.size() - 1; j >= 0; j--) {
                int value = arr.get(j) - shortest;
                if (value > 0) {
                    arr.set(j, value);
                } else {
                    arr.remove(j);
                }
            }
        }

    }
}
