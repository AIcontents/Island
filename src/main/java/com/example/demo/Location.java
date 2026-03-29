package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Location {
    private int x;
    private int y;
    private List<Organism> organisms = new ArrayList<>();

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Location() {

    }

    public void addOrganism(Organism organism) {
        if (!organisms.contains(organism)) {
            organisms.add(organism);
        }
    }

    public void removeOrganism(Organism organism) {
        organisms.remove(organism);
    }

    public List<Organism> getOrganisms() {
        return new ArrayList<>(organisms); // Return a copy to prevent concurrent modification
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void update() {
        // Create a copy of the organisms list to avoid concurrent modification issues
        List<Organism> organismsCopy = new ArrayList<>(organisms);

        for (Organism organism : organismsCopy) {
            if (organism instanceof Animal) {
                Animal animal = (Animal) organism;
                if (animal.isAlive()) {
                    animal.updateSatiety();
                    animal.eat(this);
                    animal.move(this, this); // Placeholder
                    animal.reproduce(this);
                }
            } else if (organism instanceof Plant) {
                ((Plant) organism).grow();
                organism.reproduce(this);
            }
        }

        // Remove dead animals
        organisms.removeIf(o -> o instanceof Animal && !((Animal) o).isAlive());
    }
}
