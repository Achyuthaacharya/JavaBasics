package com.company;

public class AerialAnimals extends Animals{

    public void fly(int speed){
        if (speed>2){
            System.out.println("Flying fast ");
        }else if (speed<=0){
            System.out.println("Not Flying");
        }else {
            System.out.println("Flying at normal speed");
        }
    }

    @Override
    public void motion(int speed) {
        System.out.println("Aerial Animals can Fly and Walk");
    }
}
