package Chap03;

import java.util.Scanner;

public class Ensyu4 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("変数a：");
            int a = stdIn.nextInt();
            System.out.print("変数b：");
            int b = stdIn.nextInt();

            if(a != b)
                if(a > b)
                    System.out.println("aのほうが大きいです。");
                else
                    System.out.println("bのほうが大きいです。");
            else
                System.out.println("aとbは同じ値です。");
        }
    }
}
