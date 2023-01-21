package org.example;

public abstract class Animal implements Speakable{
    private String name;
    private int kolvo;
    private String sound;

    public Animal(String name, int kolvo, String sound) {
        this.name = name;
        this.kolvo = kolvo;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getKolvo() {
        return kolvo;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String toString() {
        return String.format("name= %s, kolvo = %d, sound = %s", name, kolvo, sound);
    }

    public abstract String say();
}
