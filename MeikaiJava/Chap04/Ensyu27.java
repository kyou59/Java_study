package Chap04;

import java.util.Scanner;
import java.util.Random;

public class Ensyu27 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            Random rand = new Random();
            int no = rand.nextInt(100);

            System.out.println("数当てゲーム開始!!");
            System.out.print("0~99の数を当ててください。");
            int x;
            for(int i = 1; i <= 5; i++){
                System.out.print("いくつかな：");
                x = stdIn.nextInt();

                if(x > no)
                    System.out.println("もっと小さな数だよ。");
                else if(x < no)
                    System.out.println("もっと大きな数だよ");
                else{
                    System.out.println("正解です。");
                    break;
                }
                if(i == 5){
                    System.out.println("制限回数です。");
                    System.out.println("正解は" + no + "です。");
                }
            }
        }
    }
}