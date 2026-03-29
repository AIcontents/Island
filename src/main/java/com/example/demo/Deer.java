package com.example.demo;

public class Deer extends Herbivore {
    public Deer() {
        super(300, 20, 4, 50);
    }

    @Override
    public void move(Location from, Location to) {
        // Implementation for deer movement
    }

    @Override
    public void reproduce(Location location) {
        // Implementation for deer reproduction
    }
}
