package org.example;

public class Cat extends Animal implements Runable{
    private String color;

    public Cat(String name, int kolvo, String sound, String color) {
        super(name, kolvo, sound);
        this.color = color;
    }

    @Override
    public String say() {
        return getSound();
    }

    @Override
    public int speedOfRun() {
        return 20;
    }
}
