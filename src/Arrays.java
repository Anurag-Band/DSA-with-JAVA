import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
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



    }
}