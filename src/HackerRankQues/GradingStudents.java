package HackerRankQues;

import java.util.*;

public class GradingStudents {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<Integer> grades = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            grades.add(in.nextInt());
        }

        for (int i = 0; i < grades.size(); i++) {
            int studentGrade = grades.get(i);
            int nextMultipleOf5  =  ((studentGrade + 4) / 5) * 5;

            if (studentGrade < 38){
                System.out.println(studentGrade);
            } else if (nextMultipleOf5 - studentGrade < 3){
                studentGrade = nextMultipleOf5;
                System.out.println(studentGrade);
            } else {
                System.out.println(studentGrade);
            }
        }


    }
}
