package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimulationFunctionalTest {

    @Test
    void testSimulationRun() {
        Island island = new Island(10, 10, false);
        Simulation simulation = new Simulation(island);
        simulation.getIsland().addOrganism(new Wolf(), 0, 0);
        simulation.getIsland().addOrganism(new Rabbit(), 1, 1);

        // Run for a few cycles
        for (int i = 0; i < 5; i++) {
            simulation.runCycle();
        }

        // Assert that the simulation is still running
        assertNotNull(simulation.getIsland());
    }

    @Test
    void testPredatorEatsHerbivore() {
        Island island = new Island(1, 1, false);
        Simulation simulation = new Simulation(island);
        Wolf wolf = new Wolf();
        Horse horse = new Horse();
        island.addOrganism(wolf, 0, 0);
        island.addOrganism(horse, 0, 0);

        // Ensure predator and herbivore are in the same location
        assertEquals(1, island.getOrganismsInLocation(0, 0).stream().filter(o -> o instanceof Wolf).count());
        assertEquals(1, island.getOrganismsInLocation(0, 0).stream().filter(o -> o instanceof Horse).count());

        // Run one cycle
        simulation.runCycle();

        // After the cycle, the horse should be gone
        assertEquals(0, island.getOrganismsInLocation(0, 0).stream().filter(o -> o instanceof Horse).count());
    }
}