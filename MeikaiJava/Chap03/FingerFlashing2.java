package Chap03;

import java.util.Scanner;

public class FingerFlashing2 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("手を選べ(0：グー / 1：チョキ / 2：パー)：");
            int hand = stdIn.nextInt();
            
            switch(hand) {
                case 0: System.out.println("グー"); break;
                case 1: System.out.println("チョキ"); break;
                case 2: System.out.println("パー"); break;
            }
        }
    }
}