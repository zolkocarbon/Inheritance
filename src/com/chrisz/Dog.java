package com.chrisz;


// inherit from class Animal
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        // super calls constructor that is being extended, in this case Animal
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // created using code -> generate -> override method
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); // call inherited method eat
    }

    public void walk() {
        System.out.println("Dog.walk() was called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() was called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() was called");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() was called");
    }
}
