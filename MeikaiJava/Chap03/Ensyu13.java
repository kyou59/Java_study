package Chap03;

import java.util.Scanner;

public class Ensyu13 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数a：");
            int a = stdIn.nextInt();
            System.out.print("整数b：");
            int b = stdIn.nextInt();
            System.out.print("整数c：");
            int c = stdIn.nextInt();

            int max = a;
            int middle = b;
            
            if(b > a){
                max = b;
                middle = a;
            }
            if(c > max)
                middle = max;
            else if(c > middle)
                middle = c;

            System.out.println("中央値は" + middle + "です。");
        }
    }
}
