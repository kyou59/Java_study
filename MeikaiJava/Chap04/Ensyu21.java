package Chap04;

import java.util.Scanner;

public class Ensyu21 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("その他直角の三角形を表示します．");
            System.out.print("段数は：");
            int n = stdIn.nextInt();

            for(int i = 1; i <= n; i++){
                for(int j = n; j >= i; j--){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}