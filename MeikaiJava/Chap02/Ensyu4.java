package Chap02;

import java.util.Scanner;

public class Ensyu4 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数値：");
            int a = stdIn.nextInt();
            
            int b = a + 10;
            int c = a - 10;
            System.out.println("10を加えた値は" + b + "です。");
            System.out.println("10を減じた値は" + c + "です。");
        }
    }
}