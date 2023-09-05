package Chap04;

import java.util.Scanner;

public class Ensyu22 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("段数は：");
            int n = stdIn.nextInt();

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= (n - 1) * 2 + 1; j++){
                    if(j >= n - i + 1 && j <= n + i - 1)
                        System.out.print('*');
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}