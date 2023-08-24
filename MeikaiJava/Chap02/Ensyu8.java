package Chap02;

import java.util.Scanner;
import java.util.Random;

public class Ensyu8 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数値：");
            int seisu = stdIn.nextInt();

            Random rand = new Random();
            int ransu = rand.nextInt(10);

            System.out.println("その値の±5の乱数を生成しました．それは" + (seisu + ransu - 5) + "です．");
        }
    }
}