package Chap04;

import java.util.Scanner;

public class Ensyu9 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("1からnまでの積を求めます。");
            int n;
            do{
                System.out.print("nの値：");
                n = stdIn.nextInt();
            }while(n <= 0);

            int multi = 1;
            int i = 1;
            while(i <= n){
                multi *= i;
                i++;
            }
            System.out.println("1から" + n + "までの積は" + multi + "です。");
        }
    }
}