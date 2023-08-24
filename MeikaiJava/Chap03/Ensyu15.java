package Chap03;

import java.util.Scanner;

public class Ensyu15 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数a：");
            int a = stdIn.nextInt();
            System.out.print("整数b：");
            int b = stdIn.nextInt();
            
            if(a < b) {
                int t = b;
                b = a;
                a = t;
            }

            System.out.println("a≧bとなるようにソートしました。");
            System.out.println("変数aは" + a + "です。");
            System.out.println("変数bは" + b + "です。");
        }
    }
}