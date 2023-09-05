package Chap04;

import java.util.Scanner;

public class Ensyu3 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数a：");
            int a = stdIn.nextInt();
            System.out.print("整数b：");
            int b = stdIn.nextInt();

            int min, max, middle; 
            if(a < b){
                min = a;
                max = b;
            }else{
                min = b;
                max = a;
            }
            middle = min;

            do{ 
                System.out.print(middle + " ");
                middle = middle + 1;
            }while(middle <= max);
        }
    }
}