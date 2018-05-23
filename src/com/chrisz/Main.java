package com.chrisz;

public class Main {

    public static void main(String[] args) {
	// inheritance allows one class to inherit features from another class
        // example is a general class like cars
        // and a specific class like Mercedes
        // all cars will have make, model, year
        // but mercedes may have options like P31, AMG Package, active headlights
        // rather then having all fields defined in mercedes class we can make a general class
        // with these fields

        Animal animal = new Animal("Animal", 1,5, 1, 1);

        Dog yorkie = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "silk");

        yorkie.eat();
        yorkie.run();
        System.out.println("****");
        yorkie.walk(); // will call super.move which is Animal.move
    }
}

// a class is a blueprint for a house
// each house you build is an object, also known as an instance
// say you create a house blueHouse, the blueHouse variable is a "reference" to the "object" in memory
// constructors and private methods cannot be overridden


// this() can only be used in a constructor and it must be the first statement in the constructor,
// used to call a constructor from another overloaded constructor in the same class
// look at the Bird class as an example

// super() calls constructor from parent class

// method overloading is creating more than one method with the same name but different number of parameters

// method overriding is creating a method in a child class that exists in the parent class
// we can only override instance methods, not static




