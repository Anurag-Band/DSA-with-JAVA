package HackerRankQues;

import java.util.*;

public class UtopianTree {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        int [] n = new int[t];

        for (int i = 0; i < t; i++){
            n[i] = in.nextInt();
        }

        for (int i = 0; i < t; i++){
            int height = 1;

            for (int j = 0; j < n[i]; j++){
                if (j % 2 == 0){
                    height *= 2;
                } else {
                    height += 1;
                }
            }
            System.out.println(height);
        }

    }
}

//but this means if (j % 2 == 0){ mean even so we should be  doing  height += 1;
//ChatGPT said:
//ChatGPT
//You're absolutely correct that the expression j % 2 == 0 evaluates to true for even values of j. However, in the context of the Utopian Tree problem, the logic is based on cycle numbers rather than their mathematical parity.
//
//The problem statement treats the 0th cycle as the first spring (growth) cycle, and the growth alternates between spring (double height) and summer (increment height) as follows:
//
//Cycle 0: Spring → Double the height
//Cycle 1: Summer → Increment the height by 1
//Cycle 2: Spring → Double the height
//Cycle 3: Summer → Increment the height by 1
//And so on...
//Clarification of the Misunderstanding:
//Cycle numbers:
//
//Spring (double height) happens in odd-numbered logical cycles (0, 2, 4, ...).
//Summer (increment height) happens in even-numbered logical cycles (1, 3, 5, ...).
//Parity mismatch:
//
//The confusion arises because the 0th logical cycle (spring) is mathematically even (j % 2 == 0). So, for j % 2 == 0, we double the height (spring logic).

//Here:
//
//Spring logic (j % 2 == 0): Double the height because the 0th cycle is a spring cycle.
//Summer logic (j % 2 != 0): Increment the height by 1.
//
//Why This Matches the Problem Description:
//The problem alternates spring (double) and summer (increment) starting with spring. Although the 0th cycle is even numerically, it corresponds to the first spring cycle. This is why you need to double the height for j % 2 == 0.