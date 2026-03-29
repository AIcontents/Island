package com.example.demo;

public class Horse extends Animal {
    public Horse() {
        super(400, 5, 2, 60);
    }

    @Override
    public void eat(Location location) {
        for (Organism organism : location.getOrganisms()) {
            if (organism instanceof Plant) {
                location.removeOrganism(organism);
                increaseSatiety(organism.getWeight());
                return; // Horse eats one plant and is done for now
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
