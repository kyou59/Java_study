package Chap04;

import java.util.Scanner;

public class Ensyu13 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("1からnまでの和を求めます。");
            System.out.print("nの値：");
            int n = stdIn.nextInt();
            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum += i;
            }
            System.out.println("1から" + n + "までの和は" + sum + "です。");
        }
    }
}
