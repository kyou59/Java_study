package Chap02;

import java.util.Scanner;

public class HelloNextLine {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("お名前は：");
            String s = stdIn.nextLine();

            System.out.println("こんにちは" + s + "さん．");
        }
    }
}
