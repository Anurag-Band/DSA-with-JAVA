package HackerRankQues;

import java.util.Scanner;

public class DesignerPdfViewer {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n=26;

        int [] h = new int[n];

        for(int i=0;i<n;i++){
            int value=in.nextInt();
            h[i]=value;
        }
        in.nextLine();
        String word=in.nextLine();
        int mx=0;
        for(int i=0;i<word.length();i++){
            if(h[word.charAt(i)-97]>mx){
                mx=h[word.charAt(i)-97];
            }
        }
        System.out.println(mx*word.length());


    }
}
