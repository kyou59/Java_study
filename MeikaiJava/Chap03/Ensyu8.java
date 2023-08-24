package Chap03;

import java.util.Scanner;

public class Ensyu8 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("成績を判定します。 \n何点ですか：");
            int score = stdIn.nextInt();

            if(score >= 0 && score <= 59)
                System.out.println("不可");
            else if(score >= 60 && score <= 69)
                System.out.println("可");
            else if(score >= 70 && score <= 79)
                System.out.println("良");
            else if(score >=80 && score <= 100)
                System.out.println("優");
        }
    }
}
