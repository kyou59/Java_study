package Chap03;

import java.util.Scanner;

public class DightsNo2 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数値：");
            int n = stdIn.nextInt();

            if(n <= -10 || n >= 10)
                System.out.println("2桁以上です");
            else
                System.out.println("2桁未満です。");
        }
    }
}
