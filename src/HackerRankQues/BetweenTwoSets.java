package HackerRankQues;

import java.util.*;

public class BetweenTwoSets {
    // Method to calculate GCD
    public static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }

    // Method to calculate LCM
    public static int getLCM(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        return Math.abs(n1 * n2) / getGCD(n1, n2);
    }

    // Method to calculate the total count of integers satisfying the condition
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;

        // Get LCM of all elements in `a`
        int lcm = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcm = getLCM(lcm, a.get(i));
        }

        // Get GCD of all elements in `b`
        int gcd = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcd = getGCD(gcd, b.get(i));
        }

        // Count multiples of lcm that divide the gcd
        int multiple = lcm;
        while (multiple <= gcd) {
            if (gcd % multiple == 0) {
                result++;
            }
            multiple += lcm;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of arrays
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Input list `a`
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        // Input list `b`
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(scanner.nextInt());
        }

        // Get result and print it
        int result = getTotalX(a, b);
        System.out.println(result);
    }
}
