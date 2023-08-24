package Chap03;

import java.util.Scanner;

public class Ensyu1 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数値：");
            int n = stdIn.nextInt();

            if(n > 0)
                System.out.println("その絶対値は" + n + "です。");
            else if(n < 0)
                System.out.println("その絶対値は" + (-n) + "です。");
            else
                System.out.println("その絶対値は0です。");
        }
    }
}
