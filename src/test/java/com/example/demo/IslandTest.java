package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IslandTest {

    private Island island;

    @BeforeEach
    void setUp() {
        island = new Island(3, 3, false);
    }

    @Test
    void testIslandCreation() {
        assertEquals(3, island.getWidth());
        assertEquals(3, island.getHeight());
        assertNotNull(island.getLocations());
        assertEquals(9, island.getLocations().length);
    }

    @Test
    void testAddOrganism() {
        Wolf wolf = new Wolf();
        island.addOrganism(wolf, 0, 0);
        Location location = island.getLocations()[0];
        assertTrue(location.getOrganisms().contains(wolf));
    }

    @Test
    void testRemoveOrganism() {
        Wolf wolf = new Wolf();
        island.addOrganism(wolf, 0, 0);
        Location location = island.getLocations()[0];
        island.removeOrganism(wolf, 0, 0);
        assertFalse(location.getOrganisms().contains(wolf));
    }

    @Test
    void testGetOrganismsInLocation() {
        Wolf wolf = new Wolf();
        island.addOrganism(wolf, 1, 1);
        List<Organism> organisms = island.getOrganismsInLocation(1, 1);
        assertEquals(1, organisms.size());
        assertEquals(wolf, organisms.get(0));
    }

    @Test
    void testMoveOrganism() {
        Wolf wolf = new Wolf();
        island.addOrganism(wolf, 0, 0);
        island.moveOrganism(wolf, 0, 0, 1, 1);
        Location oldLocation = island.getLocations()[0];
        Location newLocation = island.getLocations()[4];
        assertFalse(oldLocation.getOrganisms().contains(wolf));
        assertTrue(newLocation.getOrganisms().contains(wolf));
    }
}