package org.example;

public class Fish extends Animal implements Floating{
    private int speed;
    public Fish(String name, int kolvo, String sound, int speed) {
        super(name, kolvo, sound);
        this.speed = speed;
    }

    @Override
    public String say() {
        return "Bul'k-bul'k";
    }

    @Override
    public int speedFloat() {
        return speed;
    }
}
