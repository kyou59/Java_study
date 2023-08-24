package Chap02;

import java.util.Scanner;

public class Ensyu5 {
    public static void main (String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            //System.out.println("xとyを加減乗除します。");

            System.out.print("xの値：");
            double x = stdIn.nextDouble();

            System.out.print("yの値：");
            double y = stdIn.nextDouble();

            /*
            System.out.println("x + y = " + (x + y));
            System.out.println("x - y = " + (x - y));
            System.out.println("x * y = " + (x * y));
            System.out.println("x / y = " + (x / y));
            System.out.println("x % y = " + (x % y));
            */

            System.out.println("合計は" + (x + y) + "です。");
            System.out.println("平均は" + (x + y) / 2 + "です。");
        }
    }
}
