package Chap03;

import java.util.Scanner;

public class Ensyu2 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数A：");
            int a = stdIn.nextInt();
            System.out.print("整数B：");
            int b = stdIn.nextInt();

            if(a % b == 0)
                System.out.println("BはAの約数です。");
            else
                System.out.println("BはAの約数ではありません。");
        }
    }
}
