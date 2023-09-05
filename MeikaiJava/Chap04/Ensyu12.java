package Chap04;

import java.util.Scanner;

public class Ensyu12 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("カウントアップします。");
            System.out.print("正の整数値：");
            int x = stdIn.nextInt();

            for (int i = 0; i <= x; i++)
                System.out.println(i);
        }
    }
}