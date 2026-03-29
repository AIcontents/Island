package com.example.demo;

public abstract class Animal extends Organism {
    private boolean isAlive = true;
    private double satiety;

    public Animal(double weight, int maxPerCell, int speed, double foodRequired) {
        super(weight, maxPerCell, speed, foodRequired);
        this.satiety = foodRequired;
    }

    public abstract void eat(Location location);

    public abstract void move(Location from, Location to);

    public void updateSatiety() {
        // Decrease satiety each cycle. Let's say it decreases by a fixed amount for simplicity.
        this.satiety -= getFoodRequired() * 0.25; 
        if (this.satiety <= 0) {
            die();
        }
    }

    public void increaseSatiety(double amount) {
        this.satiety += amount;
        if (this.satiety > getFoodRequired()) {
            this.satiety = getFoodRequired();
        }
    }

    public void die() {
        isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getMaxCountOnLocation() {
        return getMaxPerCell();
    }

    public double getFullness() {
        return getFoodRequired();
    }
}
