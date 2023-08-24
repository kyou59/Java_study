package Chap03;

import java.util.Scanner;

public class Ensyu14 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数a：");
            int a = stdIn.nextInt();
            System.out.print("整数b：");
            int b = stdIn.nextInt();

            if(a != b){
                int min, max;
                if(a < b) {
                    min = a;
                    max = b;
                }else{
                    min = b;
                    max = a;
                }
                System.out.println("小さい方の値は" + min + "です。");
                System.out.println("大きい方の値は" + max + "です。");
            }else{
                System.out.println("二つの値は同じです。");
            }
        }
    }
}