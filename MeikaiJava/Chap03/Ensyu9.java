package Chap03;

import java.util.Scanner;

public class Ensyu9 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数a：");
            int a = stdIn.nextInt();
            System.out.print("整数b：");
            int b = stdIn.nextInt();

            int max= a > b ? a : b; //大きい方の値
            System.out.println("大きい方の値は" + max + "です。");
        }
    }
}
