package Chap04;

import java.util.Scanner;

public class Ensyu1 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            int retry;
            do{
                System.out.print("整数値：");
                int n = stdIn.nextInt();

                if(n > 0)
                    System.out.println("その値は正です。");
                else if(n < 0)
                    System.out.println("その値は負です。");
                else
                    System.out.println("その値は0です。");
                
                System.out.print("もう一度？ 1. Yes / 0. No : ");
                retry = stdIn.nextInt();
            }while(retry == 1);
        }
    }
}