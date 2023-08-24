package Chap03;

import java.util.Scanner;

public class Min2 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数a：");
            int a = stdIn.nextInt();
            System.out.print("整数b：");
            int b = stdIn.nextInt();

            int min; //小さい方の値
            if(a < b)
                min = a;
            else
                min = b;

            System.out.println("小さい方の値は" + min + "です。");
        }
    }
}
