package Chap04;

import java.util.Scanner;

public class OddNo {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数値：");
            int n = stdIn.nextInt();

            for(int i = 1; i <= n; i += 2)
                System.out.println(i);
        }
    }
}
