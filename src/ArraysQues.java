import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysQues {
    public static void main(String[] args) {
//        // Declare and initialize an array
//        int[] numbers = {10, 20, 30, 40, 50};
//
//        // Iterate using a loop
//        System.out.print("Using for loop: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }

//        ArrayList<String> names = new ArrayList<>();
//        names.add("Alice");
//        names.add("Bob");
//        names.add("Charlie");
//
//        System.out.println(names);
//
//        names.add(1, "David");  // Inserts "David" at index 1
//        System.out.println(names);

//        String name = names.get(1);  // Retrieves the element at index 1
//        System.out.println(name);  // Output: David

//        Example Program

//        // Create an ArrayList of Strings
//        ArrayList<String> fruits = new ArrayList<>();
//
//        // Add elements
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Cherry");
//
//        // Print the ArrayList
//        System.out.println("Fruits: " + fruits);
//
//        // Access an element
//        System.out.println("First fruit: " + fruits.get(0));
//
//        // Update an element
//        fruits.set(1, "Blueberry");
//        System.out.println("Updated Fruits: " + fruits);
//
//        // Remove an element
//        fruits.remove("Cherry");
//        System.out.println("After removal: " + fruits);
//
//        // Sort the ArrayList
//        Collections.sort(fruits);
//        System.out.println("Sorted Fruits: " + fruits);
//
//        // Check if the ArrayList contains a value
//        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));
//
//        // Clear the ArrayList
//        fruits.clear();
//        System.out.println("After clearing: " + fruits.isEmpty());

//       Q. 1) sum of even numbers and odd numbers in a array

//        int nums[] = {1,2,3,4,5,6,7,8,9};
//
//        int sumOfEvens = 0;
//        int sumOfOdds = 0;
//
//        for (int i = 0; i < nums.length; i++){
//
//            if (nums[i]%2 == 0){
//                sumOfEvens += nums[i];
//            } else {
//                sumOfOdds += nums[i];
//            }
//        }
//
//        System.out.println("Sum of Odd's: " + sumOfOdds);
//        System.out.println("Sum of Even's: " + sumOfEvens);

//        _____________________________________________

//       Q. 2) sum of even index and odd index in an array

//        int nums[] = {1,2,3,4,5,6,7,8,9};
//
//        int sumOfEvenIdx = 0;
//        int sumOfOddIdx = 0;
//
//        for (int i = 0; i < nums.length; i++){
//            if(i%2==0){
//                sumOfEvenIdx += nums[i];
//            }else {
//                sumOfOddIdx += nums[i];
//            }
//        }
//
//        System.out.println("Sum of Odd's: " + sumOfOddIdx);
//        System.out.println("Sum of Even's: " + sumOfEvenIdx);

//        ---------------------------------------------

//        Q. 3) Sum of pairs using single array

//         int nums[] = {1,2,3,4,5,6};
//
//         int sum = 0;
//
//         for (int i = 0; i < nums.length; i++){
//             for (int j = i + 1; j < nums.length; j++){
//                 sum += nums[i] + nums[j];
//             }
//         }
//
//         System.out.print("Sum : " + sum);

//        ---------------------------------------------

//        Q. 4) Sum of pairs using Two arrays

//         int nums1[] = {1,2,3};
//         int nums2[] = {4,5,6};
//
//         int sum = 0;
//
//         for (int i = 0; i < nums1.length; i++){
//             for (int j = 0; j < nums2.length; j++){
//                 sum += nums1[i] + nums2[j];
//             }
//         }
//
//        System.out.print("Sum : " + sum);

//        ---------------------------------------------

//        Q. 5) find Maximum pair sum using Two arrays

//         int nums1[] = {1,2,3,4};
//         int nums2[] = {4,5,6,7};
//
//         int maxSum = 0;
//
//        for (int i = 0; i < nums1.length; i++){
//            for (int j =0; j < nums2.length; j++){
//                int sum = nums1[i] + nums2[j];
//
//                if (sum > maxSum){
//                    maxSum = sum;
//                }
//            }
//
//        }
//
//        System.out.print("Max Sum : " + maxSum);

//        ---------------------------------------------

//        Q. 6) find Sum of Triplets

//         int nums[] = {1,2,3,4};
//         int sum = 0;
//
//         for (int i = 0; i < nums.length - 2; i++){
//             for (int j = i + 1; j < nums.length - 1; j++){
//                 for (int k = j + 1; k < nums.length; k++){
//                     sum = nums[i] + nums[j] + nums[k];
//                     System.out.println("Sum : " + sum);
//                 }
//             }
//         }

//        ---------------------------------------------

//        Q. 7) Count of distinct element
//        vis = [f,f,f,t,f,t]

//        int [] arr ={2,3,5,3,6,2};
//        int n= arr.length;
//        boolean [] vis= new boolean[101];
//        Arrays.fill(vis,false);
//        int count=0;
//        for(int i=0;i<n;i++){
//            if(vis[arr[i]]==false){
//                count++;
//                vis[arr[i]]=true;
//            }
//        }
//        System.out.println(count);

//        ---------------------------------------------

//        Q. 8) Prime numbers between range

//        Prime Number: a number which is only divisible by 1 & itself

        //        2 % 2 = 0
        //        2 % 2 = 0...2  ✔️

        //        4 % 1 = 0
        //        4 % 4 = 0
        //        4 % 2 = 0...3  ❌


//        int n = 20;
//
//        for (int i = 0; i < n; i++){
//            int count = 0;
//            for (int j = 1; j <= i; j++){
//                if(i % j == 0){
//                    count++;
//                }
//            }
//            if(count == 2){
//                System.out.print(i + " ");
//            }
//        }

//        ---------------------------------------------

//        Q. 9) Summation of reverse of numbers between a range

//        Step 1:- run a loop for the range
//        Step 2:- pick a number one by one & reverse it
//        Step 3:- add the rev number into sum

//        Steps to Reverse a number :-

//        1. do modulo 10 with the number to get the last digit
//        2. multiply 10 with the rev variable and add the reminder
//        3. divide the number by 10 to shrink the number
//        4. do this process until the number becomes 0

//        123 -> 321

//        int start = 21;
//        int end = 25;
//        int sum = 0;
//
//        for (int i = start; i <= end; i++){
//            int rev = 0;
//            int num = i;
//            while (num > 0){
//                int rem = num % 10;
//                rev = rev * 10 + rem;
//                num = num / 10;
//            }
//            sum += rev;
//        }
//        System.out.println("Sum: " + sum);

//        ---------------------------------------------

//        Q. 10) First and last index of a target element of a sorted array

//            int [] arr = {1,2,3,4,5,6,6,7,8};
//
//            int target = 6;
//            int firstIdx = 0;
//            int lastIdx = 0;
//
//            for (int i = 0; i < arr.length; i++){
//                if(arr[i] == target){
//                    firstIdx = i;
//                    break;
//                } else {
//                    firstIdx = -1;
//                }
//            }
//
//            for (int i = arr.length - 1; i >= 0; i--) {
//                if (arr[i] == target){
//                    lastIdx = i;
//                    break;
//                } else {
//                    lastIdx = -1;
//                }
//            }
//
//            System.out.println("First Idx: " + firstIdx);
//            System.out.println("Last Idx: "+ lastIdx);

//        ---------------------------------------------

//        Q. 11) Count frequency of each element
//        Steps :-
//              1. Initialize the visited array of size n (size of array) & fill it with all f
//              2. Traverse the array first
//              3. Check if(vis[i]==false) initialize  vis[i]=true && int count = 1
//              4. Run a loop from i + 1 to check how many times it is occurring
//              5. if(arr[i] == arr[j]) then vis[j] = t && count++

//        int [] arr = {10,2,3,3,5,6,6,7,8};
//
//        int n = arr.length;
//        boolean [] vis = new boolean[n];
//        Arrays.fill(vis, false);
//
//        for (int i = 0; i < n; i++){
//            if(vis[i] == false){
//                vis[i]=true;
//                int count = 1;
//                for (int j = i + 1; j < n; j++){
//                    if(arr[i] == arr[j]){
//                        vis[j] = true;
//                        count++;
//                    }
//                }
//                System.out.println(arr[i] + " => " + count);
//            }
//        }



    }
}