package Chap04;

import java.util.Scanner;

public class Ensyu6 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("何個*を表示しますか：");
            int n = stdIn.nextInt();

            int i = 0;
            while(i < n){
                System.out.print('*');
                i++;
            }
            if(i == n){
                System.out.println();
            }
        }
    }
}
