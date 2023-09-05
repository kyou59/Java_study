package Chap04;

import java.util.Scanner;

public class Ensyu20 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("正方形を表示します．");
            System.out.print("辺の長さは：");
            int n = stdIn.nextInt();

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}