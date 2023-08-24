package Chap02;

import java.util.Random;

public class Ensyu9 {
    public static void main(String[] args){
        Random rand = new Random();

        Double lucky1 = rand.nextDouble(1);
        Double lucky2 = rand.nextDouble(10);
        Double lucky3 = rand.nextDouble(2);

        System.out.println(lucky1);
        System.out.println(lucky2);
        System.out.println(lucky3 - 1);
    }
}
