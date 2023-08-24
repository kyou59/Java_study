package Chap03;

import java.util.Scanner;

public class Ensyu16 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数a：");
            int a = stdIn.nextInt();
            System.out.print("整数b：");
            int b = stdIn.nextInt();
            System.out.print("整数c：");
            int c = stdIn.nextInt();
            
            if(a > b) {
                int s = a;
                a = b;
                b = s;
            }

            if(c < a){
                int t = c;
                c = b;
                b = a;
                a = t;
            }else if(c < b){
                int u = c;
                c = b;
                b = u;
            }

            System.out.println("a≦b≦cとなるようにソートしました。");
            System.out.println("変数aは" + a + "です。");
            System.out.println("変数bは" + b + "です。");
            System.out.println("変数cは" + c + "です。");
        }
    }
}