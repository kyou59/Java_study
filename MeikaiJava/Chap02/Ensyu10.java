package Chap02;

import java.util.Scanner;

public class Ensyu10 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("姓：");
            String s1 = stdIn.next();

            System.out.print("名：");
            String s2 = stdIn.next();

            System.out.println("こんにちは" + s1 + s2 + "さん．");
        }
    }
}
