package Chap03;

import java.util.Scanner;

public class Ensyu18 {
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("何月：");
            int month = stdIn.nextInt();
            
            switch(month){
                case 12:
                case 1: 
                case 2: System.out.println("冬"); break;
                case 3: 
                case 4: 
                case 5: System.out.println("春"); break;
                case 6: 
                case 7: 
                case 8: System.out.println("夏"); break;
                case 9: 
                case 10: 
                case 11: System.out.println("秋"); break;
            }
        }
    }
}