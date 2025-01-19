package HackerRankQues;

import java.util.*;

public class JimAndTheOrders {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int[] order = new int[n];
            int[] prepTime = new int[n];

            for (int i = 0; i < n; i++) {
                order[i] = in.nextInt();
                prepTime[i] = in.nextInt();
            }

            // Create an array of pairs to store deliveryTime and order index
            int[][] delivery = new int[n][2];
            for (int i = 0; i < n; i++) {
                delivery[i][0] = order[i] + prepTime[i]; // deliveryTime
                delivery[i][1] = i + 1; // order index (1-based)
            }

            // Sort the array based on deliveryTime, and by order index if deliveryTimes are equal
            Arrays.sort(delivery, (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            });

            // Output the sorted order indices
            for (int i = 0; i < n; i++) {
                System.out.print(delivery[i][1] + " ");
            }


        }
}
//
//The issue in your code lies in the handling of duplicate deliveryTime values in the HashMap. When two orders have the same deliveryTime, the HashMap will overwrite the previous entry with the same key, as HashMap does not allow duplicate keys. This results in incorrect mapping of delivery times to order indices.
//
//To fix this issue, you need to handle duplicate deliveryTime values properly. Instead of using a HashMap, you can use an array of objects (or a list of pairs) that stores both the deliveryTime and the order index. Then, you can sort this array or list based on deliveryTime, and in case of ties, based on the order index.

//Scanner in = new Scanner(System.in);
//
//int n = in.nextInt();
//int [] order = new int[n];
//int [] prepTime = new int[n];
//
//        for (int i = 0; i < n; i++){
//order[i] = in.nextInt();
//prepTime[i] = in.nextInt();
//        }
//
//HashMap <Integer,Integer> hmp = new HashMap<>();
//int [] delivery = new int[n];
//
//        for (int i = 0; i < n; i++){
//int deliveryTime = order[i] + prepTime[i];
//delivery[i] = deliveryTime;
//            hmp.put(deliveryTime, i+1);
//        }
//
//
//                Arrays.sort(delivery);
//
//        for (int i = 0; i < n; i++){
//int value = delivery[i];
//
//            System.out.print(hmp.get(value) + " ");
//        }
//