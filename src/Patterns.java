import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
//  Lecture 1 :- square with zero's

//        for (int i = 0; i <= 4; i++) {
//            for (int j = 0; j <= 5; j++) {
//                System.out.print(" 0 ");
//            }
//            System.out.println();
//        }

//  Lecture 1 :-

//        for (int i = 0; i<=4; i++){
//            for (int j = 0; j < i + 1; j++){
//                System.out.print("0");
//            }
//            System.out.println();
//        }

//  Lecture 2 :-

//        for (int i = 0; i<=3; i++){
//            int num = 0;
//            for (int j = 0; j < i + 1; j++){
//                num++;
//                System.out.print(num);
//            }
//            System.out.println();
//        }

//  Lecture 2 :-

//        for (int i = 0; i<=3; i++){
//            for (int j = 0; j < i + 1; j++){
//                System.out.print(i+1);
//            }
//            System.out.println();
//        }

//  Lecture 3 :- Print alphabets pattern till n
//                    A
//                    B B
//                    C C C
//                    D D D D

//        System.out.print("Enter the value of n : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print((char)(65 + i));
//            }
//            System.out.println();
//        }

//   Lecture 3 :- Q.1 ->> Print below pattern
//        for n = 5;
//        print :-
//                  0
//                  12
//                  234
//                  3456
//                  45678

//        System.out.print("Enter the value of n : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j <= 2 * i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//

//        for n = 4;
//        print :-
//                  A
//                  B C
//                  C D E
//                  D E F G
//        convert to ascii numbers first
        //          65
        //          66 67
        //          67 68 69
        //          68 69 70 71

//        System.out.print("Enter the value of n : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j <= 2 * i; j++) {
//                System.out.print((char)(j + 65));
//            }
//            System.out.println();
//        }

// Lecture 3 :- Q.2 ->> Print the following pattern for the given number of rows.

//        for n = 5;
//        print :-
//      4
//      34
//      234
//      1234
//      01234

//        System.out.print("Enter the value of n : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++){
//            for (int j = i; j >= 0; j--){
//                System.out.print(n-(j+1));
//            }
//            System.out.println();
//        }


//        for n = 5;
//        print :-
//                  E
//                  D E
//                  C D E
//                  B C D E
//                  A B C D E

//        System.out.print("Enter the value of n : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++){
//            for (int j = i; j >= 0; j--){
//                System.out.print((char) (n-(j+1) + 65));
//                System.out.print((char) (n - j-1 + 65));
//            }
//            System.out.println();
//        }

//   Lecture 4 :- Q.1 ->>
//        for n = 4
//        print :-
//                          1
//                        1 2
//                      1 2 3
//                    1 2 3 4

//        System.out.print("Enter the value of n : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++){
//            for (int j = 1; j <= n-i-1; j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i+1; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

//  Lecture 4 :- Q.2 ->>
//        for n = 4
//        print :-
//                    4 4 4 4      1
//                    3 3 3
//                    2 2
//                    1

//        System.out.print("Enter the value of n : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n - i; j++){
//                System.out.print(n - i);
//            }
//            System.out.println();
//        }

//  Lecture 5 :- Q.1 ->>
//        for n = 4
//        print :-
//                    . . . 1
//                    . . 2 3 2
//                    . 3 4 5 4 3
//                    4 5 6 7 6 5 4

//        System.out.print("Enter the value of n : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++){
//
//          for Printing DOTS:
//            for (int j = 0; j <= n - i - 1; j++){
//                System.out.print(".");
//            }
//          for Printing Increment Nums:
//            for (int j = i + 1; j <= 2 * i + 1; j++){
//                System.out.print(j);
//            }
//          for Printing Decrement Nums:
//            for (int j = 2 * i; j >= i + 1; j--){
//                System.out.print(j);
//            }
//
//            System.out.println();
//        }

    }
}
