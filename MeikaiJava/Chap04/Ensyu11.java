package Chap04;

import java.util.Scanner;

public class Ensyu11 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("カウントダウンします。");
            System.out.print("正の整数値：");
            int x = stdIn.nextInt();

            for (int i = x; i >= 0; i--)
                System.out.println(i);
        }
    }
}