package Chap04;

import java.util.Scanner;

public class Ensyu8 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            int x;
            do{
                System.out.print("正の整数値：");
                x = stdIn.nextInt();
            }while(x <= 0);

            int i = 0;

            while(x > 0){
                x /= 10;
                i++;
            }
            System.out.println("その値は" + i + "桁です。");
        }
    }
}