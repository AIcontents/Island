package com.example.demo;

public class Bear extends Predator {
    public Bear() {
        super(500, 5, 2, 80);
    }

    @Override
    public void move(Location from, Location to) {
        // Implementation for bear movement
    }

    @Override
    public void reproduce(Location location) {
        // Implementation for bear reproduction
    }
}
