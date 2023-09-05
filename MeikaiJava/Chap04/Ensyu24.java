package Chap04;

import java.util.Scanner;

public class Ensyu24 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("素数であるか判定．");
            System.out.print("正の整数値：");
            int n = stdIn.nextInt();
            
            for(int i = 2; i < n; i++){
                if (n % i == 0){
                    System.out.println(n + "は素数ではありません．");
                    break;
                }
                if(i == n - 1 && n % i != 0){
                    System.out.println(n + "は素数です．");
                }
            }
        }
    }
}