package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList <Animal> animals;
    private Radio radio = new Radio();
    public Zoo() {
        animals = new ArrayList<>();
    }
    public Zoo addAnimal (Animal a){
        animals.add(a);
        return this;
    }
    public List<Speakable> getSpeakables(){
        List<Speakable> answer = new ArrayList<>();
        for(Animal an : animals){
            answer.add(an);
        }
        answer.add(radio);
        return answer;
    }
    public List<Runable> getRunner(){
        List<Runable> result = new ArrayList<>();
        for(Animal an : animals){
            if (an instanceof Runable){
                result.add((Runable) an);
            }
        }
        return result;
    }
    public List<Flyable> getFlyer(){
        List<Flyable> flyers = new ArrayList<>();
        for(Animal an : animals){
            if(an instanceof Flyable){
                flyers.add((Flyable) an);
            }
        }
        return flyers;
    }
    public List<Floating> getFloater(){
        List<Floating> flyers = new ArrayList<>();
        for(Animal an : animals){
            if(an instanceof Floating){
                flyers.add((Floating) an);
            }
        }
        return flyers;
    }
    public int getChampSpeed(){
        int max1 = 0;
        for(Runable runner : getRunner()){
            if (max1 < runner.speedOfRun()){
                max1 = runner.speedOfRun();
            }
        }
        return max1;
    }
    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
