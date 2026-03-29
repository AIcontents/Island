package com.example.demo;

public abstract class Organism {
    private double weight;
    private int maxPerCell;
    private int speed;
    private double foodRequired;

    public Organism(double weight, int maxPerCell, int speed, double foodRequired) {
        this.weight = weight;
        this.maxPerCell = maxPerCell;
        this.speed = speed;
        this.foodRequired = foodRequired;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxPerCell() {
        return maxPerCell;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFoodRequired() {
        return foodRequired;
    }

    public abstract void reproduce(Location location);
}
