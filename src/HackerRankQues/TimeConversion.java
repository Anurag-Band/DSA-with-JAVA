package HackerRankQues;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        // Check if it's PM
        if (s.charAt(8) == 'P') {
            String portion = s.substring(0, 8);
            String[] time = portion.split(":");
            if (time[0].equals("12")) {
                System.out.println(time[0] + ":" + time[1] + ":" + time[2]);
            } else {
                time[0] = String.valueOf(Integer.valueOf(time[0]) + 12);
                System.out.println(time[0] + ":" + time[1] + ":" + time[2]);
            }
        }
        // Check if it's AM
        else {
            String portion = s.substring(0, 8);
            String[] time = portion.split(":");
            if (time[0].equals("12")) {
                time[0] = "00";
                System.out.println(time[0] + ":" + time[1] + ":" + time[2]);
            } else {
                System.out.println(portion);
            }
        }
    }
}
