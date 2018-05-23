package com.chrisz;

public class Bird {
    private int windSpan;
    private int beakSize;

    //1st constructor

    public Bird(int windSpan, int beakSize) {
        this.windSpan = windSpan;
        this.beakSize = beakSize;
    }

    public Bird() {
        this(0,0); // calls Bird(0,0)
    }
}
