package Chap04;

import java.util.Scanner;

public class Ensyu17 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数値：");
            int n = stdIn.nextInt();
            int j = 0;

            for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    System.out.println(i);
                    j++;
                }
            }
            System.out.println("約数は" + j + "個です．");
        }
    }
}
