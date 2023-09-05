package Chap04;

import java.util.Scanner;

public class Ensyu14 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("nの値：");
            int n = stdIn.nextInt();
            int sum = 0;
            for(int i = 1; i <= n; i++){
                if(i == 1){
                    System.out.print(i);
                }else{
                    System.out.print(" + " + i);
                }
                sum += i;
            }
            System.out.println(" = " + sum);
        }
    }
}
