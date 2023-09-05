package Chap04;

import java.util.Scanner;

public class Ensyu15 {
    public static void main (String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("何cmから：");
            int a = stdIn.nextInt();
            System.out.print("何cmまで：");
            int b = stdIn.nextInt();
            System.out.print("何cmごと：");
            int c = stdIn.nextInt();
            System.out.println("身長 標準体重");

            for(int i = a, j = (int) ((i - 100) * 0.9); i <= b; i += c) 
                System.out.println(i + " " + j);
        }
    }
}
