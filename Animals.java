package com.company;

public class Animals {
    private int legs;
    private boolean eat;
    private int ears;

    public Animals(int legs, boolean eat, int ears) {
        this.legs = legs;
        this.eat = eat;
        this.ears = ears;
    }
    public Animals(){
    }

    public String printAll() {
        return "Animals{" +
                "legs=" + legs +
                ", eat=" + eat +
                ", ears=" + ears +
                '}';
    }

    public void motion(int speed){
        System.out.println("Animal running ");
    }
    public void eats(){
        System.out.println("Animal eating ");
    }

}
