package Chap03;

import java.util.Random;

public class Ensyu17 {
    public static void main(String[] args){
        Random rand = new Random();
        int n = rand.nextInt(3);
            
            switch(n) {
                case 0: System.out.println("グー"); break;
                case 1: System.out.println("チョキ"); break;
                case 2: System.out.println("パー"); break;
            }
        }
    }