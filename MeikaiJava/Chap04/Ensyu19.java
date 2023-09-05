package Chap04;

import java.util.Scanner;

public class Ensyu19 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {

            int retry;
            int month;

            do{
                do{
                    System.out.print("季節を求めます。 \n何月ですか：");
                    month = stdIn.nextInt();
                }while(month <= 0 || month >= 13);

                if(month >= 3 && month <= 5)
                    System.out.println("それは春です");
                else if(month >= 6 && month <= 9)
                    System.out.println("それは夏です。");
                else if(month >= 9 && month <= 11)
                    System.out.println("それは秋です。");
                else if(month == 12 || month == 1 || month == 2)
                    System.out.println("それは冬です。");

                System.out.print("もう一度？ 1. Yes / 0. No : ");
                retry = stdIn.nextInt();
            }while(retry == 1);
        }
    }
}