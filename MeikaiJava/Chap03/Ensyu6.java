package Chap03;

import java.util.Scanner;

public class Ensyu6 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("正の整数値：");
            int n = stdIn.nextInt();

            if(n > 0)
                if(n % 10 == 0)
                    System.out.println("その値は10の倍数です。");
                else
                    System.out.println("その値は10の倍数ではありません。");
            else
                System.out.println("正でない値が入力されました。");
        }
    }
}