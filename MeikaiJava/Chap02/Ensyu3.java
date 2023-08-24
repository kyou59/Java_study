package Chap02;

import java.util.Scanner;

public class Ensyu3 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数値：");
            int a = stdIn.nextInt();
            
            //int b = -a;
            System.out.println(a + "と入力しましたね。");
        }
    }
}
