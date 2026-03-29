package com.example.demo;

public class Rabbit extends Herbivore {
    public Rabbit() {
        super(2, 150, 2, 0.45);
    }

    @Override
    public void move(Location from, Location to) {
        // Implementation for rabbit movement
    }

    @Override
    public void reproduce(Location location) {
        // Implementation for rabbit reproduction
    }
}
