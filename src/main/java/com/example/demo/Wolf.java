package com.example.demo;

public class Wolf extends Animal {
    public Wolf() {
        super(50, 30, 3, 8);
    }

    @Override
    public void eat(Location location) {
        for (Organism organism : location.getOrganisms()) {
            if (organism instanceof Horse) {
                location.removeOrganism(organism);
                increaseSatiety(organism.getWeight());
                return; // Wolf eats one horse and is done for now
            }
        }
    }

    @Override
    public void move(Location from, Location to) {
        // TODO: Implement movement logic
    }

    @Override
    public void reproduce(Location location) {
        // TODO: Implement reproduction logic
    }
}
