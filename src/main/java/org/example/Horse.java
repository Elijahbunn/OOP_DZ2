package org.example;

public class Horse extends Animal implements Runable{
    private double speed;

    public Horse(String name, int kolvo, String sound, double speed) {
        super(name, kolvo, sound);
        this.speed = speed;
    }


    @Override
    public String say() {
        return getSound();
    }

    @Override
    public int speedOfRun() {
        return 60;
    }
}
