package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Island {
    private Location[][] grid;
    private int width;
    private int height;

    public Island(int width, int height) {
        this(width, height, true);
    }

    public Island(int width, int height, boolean initialize) {
        this.width = width;
        this.height = height;
        this.grid = new Location[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] = new Location(i, j);
            }
        }
        if (initialize) {
            initializePopulation();
        }
    }

    private void initializePopulation() {
        // Initialize with some animals and plants
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (Math.random() < 0.1) {
                    grid[i][j].addOrganism(new Wolf());
                } else if (Math.random() < 0.2) {
                    grid[i][j].addOrganism(new Horse());
                } else if (Math.random() < 0.5) {
                    grid[i][j].addOrganism(new Grass());
                }
            }
        }
    }

    public void update() {
        // Update each location
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j].update();
            }
        }
    }

    public Location getLocation(int x, int y) {
        return grid[x][y];
    }

    public List<Location> getNeighbors(Location location) {
        List<Location> neighbors = new ArrayList<>();
        int x = location.getX();
        int y = location.getY();

        for (int i = -1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int newX = x + i;
                int newY = y + j;
                if (newX >= 0 && newX < width && newY >= 0 && newY < height) {
                    neighbors.add(grid[newX][newY]);
                }
            }
        }
        return neighbors;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Location[] getLocations() {
        return Arrays.stream(grid).flatMap(Arrays::stream).toArray(Location[]::new);
    }

    public void addOrganism(Organism organism, int x, int y) {
        grid[x][y].addOrganism(organism);
    }

    public void removeOrganism(Organism organism, int x, int y) {
        grid[x][y].removeOrganism(organism);
    }

    public List<Organism> getOrganismsInLocation(int x, int y) {
        return grid[x][y].getOrganisms();
    }

    public void moveOrganism(Organism organism, int oldX, int oldY, int newX, int newY) {
        removeOrganism(organism, oldX, oldY);
        addOrganism(organism, newX, newY);
    }
}
