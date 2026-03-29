package com.example.demo;

public class Fox extends Predator {
    public Fox() {
        super(8, 30, 2, 2);
    }

    @Override
    public void move(Location from, Location to) {
        // Implementation for fox movement
    }

    @Override
    public void reproduce(Location location) {
        // Implementation for fox reproduction
    }
}
