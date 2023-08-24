package Chap02;

import java.util.Scanner;

public class HelloNext {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("お名前は：");
            String s = stdIn.next();

            System.out.println("こんにちは" + s + "さん．");
        }
    }
}
