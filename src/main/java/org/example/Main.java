package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Barsik", 4, "miew", "gray"))
                .addAnimal(new Horse("Yasha", 4, "Igo-go", 45))
                .addAnimal(new Duck("Donald", 2, "Ga-ga"))
                .addAnimal(new Fish("Nemo", 0,"Bul'k-bul'k", 40));
        for(Animal an : zoo1.getAnimals()){
            System.out.println(an);
            System.out.println(an.getSound());
        }
        for(Speakable speak : zoo1.getSpeakables()){
            System.out.println(speak.say());
        }
        for(Runable runner : zoo1.getRunner()){
            System.out.println("Speed of " + runner + " is " + runner.speedOfRun());
        }
        int max = zoo1.getChampSpeed();
        System.out.println(String.format("Max speed = %d", max));

        for(Flyable flyer : zoo1.getFlyer()){
            System.out.println(flyer.speedFly());
        }
        for(Floating floater : zoo1.getFloater()){
            System.out.println(floater.speedFloat());
        }
    }
}