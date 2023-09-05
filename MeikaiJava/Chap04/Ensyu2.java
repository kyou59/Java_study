package Chap04;

import java.util.Scanner;
import java.util.Random;

public class Ensyu2 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            Random rand = new Random();
            int no = rand.nextInt(90);
            no = no + 10;

            System.out.println("数当てゲーム開始!!");
            System.out.print("10~99の数を当ててください。");
            int x;
            do{
                System.out.print("いくつかな：");
                x = stdIn.nextInt();

                if(x > no)
                    System.out.println("もっと小さな数だよ。");
                else if(x < no)
                    System.out.println("もっと大きな数だよ");
                }while(x != no);

                System.out.println("正解です。");
        }
    }
}