package com.company;

public class TerrestrialAnimals extends Animals{


    public TerrestrialAnimals(int legs, boolean eat, int ears) {
    }
    public TerrestrialAnimals(){
    }

    @Override
    public void motion(int speed) {
        System.out.println("Terrestrial Animals can walk and run at "+speed);
    }

}
