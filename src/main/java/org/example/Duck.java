package org.example;

public class Duck extends Animal implements Runable, Flyable{
    public Duck(String name, int kolvo, String sound) {
        super(name, kolvo, sound);
    }

    @Override
    public String say() {
        return "Ga-Ga";
    }

    @Override
    public int speedFly() {
        return 70;
    }

    @Override
    public int speedOfRun() {
        return 10;
    }
}
