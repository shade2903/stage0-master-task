package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int maxPow = 1;
        for(int i =1; i <= power; i++){
            maxPow = numberToPrint*maxPow;
        }
        System.out.println(maxPow);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
