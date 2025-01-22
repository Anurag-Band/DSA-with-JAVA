package LeetcodeContest;

import java.util.*;

public class AppyOperationsToAnArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Shift all zeros to the end using a two-pointer approach
        int nonZeroIndex = 0; // Keeps track of the position to place the next non-zero element
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element with the element at nonZeroIndex
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                nonZeroIndex++;
            }
        }


        // Print the array
        System.out.println(Arrays.toString(nums));
    }
}
