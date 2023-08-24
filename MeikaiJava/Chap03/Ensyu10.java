package Chap03;

import java.util.Scanner;

public class Ensyu10 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数a：");
            int a = stdIn.nextInt();
            System.out.print("整数b：");
            int b = stdIn.nextInt();

            int minus = a < b ? b - a : a - b;
            System.out.println("差は" + minus + "です。");
        }
    }
}
