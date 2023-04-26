package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        System.out.println(number/1000 + number%1000/100 + number%100/10 + number%10);
    }

}
