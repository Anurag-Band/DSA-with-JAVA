package LeetcodeContest;

import java.util.Scanner;

public class DetermineIfTwoEventsHaveConflict {
    public static void main(String[] args) {
        // Scanner for input
        Scanner in = new Scanner(System.in);

        // Read input for event 1
        String[] event1 = in.nextLine().split(" ");

        // Read input for event 2
        String[] event2 = in.nextLine().split(" ");

        // Call the function to check if events overlap
        Solution solution = new Solution();
        boolean result = solution.haveConflict(event1, event2);

        // Print the result
        if (result) {
            System.out.println("The events have a conflict.");
        } else {
            System.out.println("The events do not have a conflict.");
        }
    }
}

class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        // Convert times to minutes
        int start1 = toMinutes(event1[0]);
        int end1 = toMinutes(event1[1]);
        int start2 = toMinutes(event2[0]);
        int end2 = toMinutes(event2[1]);

        // Check if there is an overlap
        return start1 <= end2 && start2 <= end1;
    }

    // Helper method to convert "HH:MM" to minutes since midnight
    private int toMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
