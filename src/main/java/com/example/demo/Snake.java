package com.example.demo;

public class Snake extends Predator {
    public Snake() {
        super(15, 30, 1, 3);
    }

    @Override
    public void move(Location from, Location to) {
        // Implementation for snake movement
    }

    @Override
    public void reproduce(Location location) {
        // Implementation for snake reproduction
    }
}
