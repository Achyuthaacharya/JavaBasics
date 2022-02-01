package com.company;

public class Main {

    public static void main(String[] args) {
        // creating objects
        Animals animals=new Animals();
        animals.eats();
        animals.motion(10);

        TerrestrialAnimals terrestrialAnimals=new TerrestrialAnimals(4,true,2);
        terrestrialAnimals.motion(4);

        AerialAnimals aerialAnimals=new AerialAnimals();
        aerialAnimals.motion(20);
        aerialAnimals.fly(25);
        aerialAnimals.fly(1);
        aerialAnimals.fly(-1);

        AquaticAnimals aquaticAnimals=new AquaticAnimals();
        aquaticAnimals.motion(30);
        aquaticAnimals.sleep();

        aerialAnimals.printAll();
    }
}
