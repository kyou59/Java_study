package Chap03;

import java.util.Scanner;

public class Ensyu3 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数値：");
            int n = stdIn.nextInt();

            if(n > 0)
                System.out.println("その値は正です。");
            else if(n < 0)
                System.out.println("その値は負です。");
            else if(n == 0)
                System.out.println("その値は0です。");
        }
    }
}
