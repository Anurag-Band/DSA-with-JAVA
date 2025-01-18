package HackerRankQues;

import java.util.*;

public class FindTheMedian {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr.add(value);
        }

        Collections.sort(arr);
        int mid_ind=arr.size()/2;
        System.out.println(arr.get(mid_ind));


    }
}
