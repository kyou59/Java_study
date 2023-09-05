package Chap04;

import java.util.Scanner;

public class Ensyu7 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("何個表示しますか：");
            int n = stdIn.nextInt();

            int i = 0;
            while(i < n){
                if(i % 2 == 0){
                    System.out.print('*');
                }else{
                    System.out.print('+');
                }
                i++;
            }
            System.out.println();
        }
    }
}
