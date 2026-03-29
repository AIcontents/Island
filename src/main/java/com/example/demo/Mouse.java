package com.example.demo;

public class Mouse extends Herbivore {
    public Mouse() {
        super(0.05, 500, 1, 0.01);
    }

    @Override
    public void move(Location from, Location to) {
        // Implementation for mouse movement
    }

    @Override
    public void reproduce(Location location) {
        // Implementation for mouse reproduction
    }
}
