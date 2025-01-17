package HackerRankQues;

import java.util.ArrayList;
import java.util.Scanner;

public class CatAndMouse {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);
            int x=in.nextInt();
            int y=in.nextInt();
            int z=in.nextInt();

            int distA=Math.abs(x-z);
            int distB=Math.abs(y-z);
            if(distA<distB){
                System.out.println("Cat A");
            }else if(distB <distA){
                System.out.println("Cat B");
            }else{
                System.out.println("Mouce C");
            }

        }
}
