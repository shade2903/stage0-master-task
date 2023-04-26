package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int a = number/100;
        int b = number % 100/10;
        int c = number %10;
        System.out.println(c*100 + b*10 + a);
    }

}
