package Chap04;

import java.util.Scanner;

public class CountDown1 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("カウントダウンします。");
            int x;
            do{
                System.out.print("正の整数値：");
                x = stdIn.nextInt();
            }while(x <= 0);
            
            while(x >= 0){
                System.out.println(x);
                x--;
            }
        }
    }
}