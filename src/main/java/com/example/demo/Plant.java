package com.example.demo;

public class Plant extends Organism {
    public Plant(double weight, int maxPerCell) {
        super(weight, maxPerCell, 0, 0);
    }

    public void grow() {
        // Implementation for plant growth
    }

    @Override
    public void reproduce(Location location) {
        // Implementation for plant reproduction
    }
}
