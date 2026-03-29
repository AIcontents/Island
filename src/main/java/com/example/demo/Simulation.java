package com.example.demo;

public class Simulation {
    private Island island;
    private int cycle = 0;

    public Simulation() {
        this(new Island(100, 20));
    }

    public Simulation(Island island) {
        this.island = island;
    }

    public Island getIsland() {
        return island;
    }

    public void runCycle() {
        island.update();
        cycle++;
    }

    public void start() {
        // Main simulation loop
        while (true) {
            System.out.println("Cycle: " + cycle);
            runCycle();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.start();
    }
}
