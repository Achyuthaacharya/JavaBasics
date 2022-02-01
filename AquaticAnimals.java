package com.company;

public class AquaticAnimals extends Animals{
    public AquaticAnimals(int legs, boolean eat, int ears) {
        super(legs, eat, ears);
    }
    public AquaticAnimals() {
    }
    //Method Overload
    public void sleep(){
        System.out.println("Sleeps in the same place");
    }
    public void sleep(int stateOfMotion){
        stateOfMotion+=1;
        System.out.println("Never sleep");
    }
    @Override
    public void motion(int speed) {
        System.out.println("Aquatic Animals swim at "+speed);
    }

}
