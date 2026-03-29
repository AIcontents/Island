package com.example.demo;

public class Duck extends Herbivore {
    public Duck() {
        super(1, 200, 4, 0.15);
    }

    @Override
    public void move(Location from, Location to) {
        // Implementation for duck movement
    }

    @Override
    public void reproduce(Location location) {
        // Implementation for duck reproduction
    }
}
