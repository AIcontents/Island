package com.example.demo;

public abstract class Predator extends Animal {
    public Predator(double weight, int maxPerCell, int speed, double foodNeeded) {
        super(weight, maxPerCell, speed, foodNeeded);
    }

    @Override
    public void eat(Location location) {
        // Implementation for predators eating other animals
    }
}
