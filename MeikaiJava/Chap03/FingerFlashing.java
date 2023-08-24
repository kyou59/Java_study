package Chap03;

import java.util.Scanner;

public class FingerFlashing {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("手を選べ(0：グー / 1：チョキ / 2：パー)：");
            int hand = stdIn.nextInt();
            
            if(hand == 0) {
                System.out.println("グー");
            }else if(hand == 1){
                System.out.println("チョキ");
            }else if(hand == 2){
                System.out.println("パー");
            }
        }
    }
}