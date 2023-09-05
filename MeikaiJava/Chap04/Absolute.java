package Chap04;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)){
            a: {
                System.out.print("負の整数：");
                int t = stdIn.nextInt();
                if(t >= 0) break a;
                t = -t;
                System.out.println("絶対値は" + t + "です．");

            }
        }
    }
}