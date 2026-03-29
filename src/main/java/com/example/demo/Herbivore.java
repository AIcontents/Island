package com.example.demo;

public abstract class Herbivore extends Animal {
    public Herbivore(double weight, int maxPerCell, int speed, double foodNeeded) {
        super(weight, maxPerCell, speed, foodNeeded);
    }

    @Override
    public void eat(Location location) {
        // Implementation for herbivores eating plants
    }
}
