package com.epam.OOP;

public class Bird extends Animal {
    private int numberOfWings;

    public Bird() {
        super("blue", 2, false);
        this.numberOfWings = 2;
    }

    @Override
    public String getDescription() {
        return  "This animal is mostly " + getColor() +". It has " + getNumberOfPaws()+" paw" +
                (getNumberOfPaws()> 1 ? "s": "") + " and " + (isHasFur() ? "a":"no") + " fur. Moreover, it has " +
                this.numberOfWings + " wings and can fly.";
    }

}
