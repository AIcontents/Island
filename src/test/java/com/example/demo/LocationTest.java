package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    private Location location;

    @BeforeEach
    void setUp() {
        location = new Location();
    }

    @Test
    void testAddOrganism() {
        Wolf wolf = new Wolf();
        location.addOrganism(wolf);
        assertTrue(location.getOrganisms().contains(wolf));
    }

    @Test
    void testRemoveOrganism() {
        Wolf wolf = new Wolf();
        location.addOrganism(wolf);
        location.removeOrganism(wolf);
        assertFalse(location.getOrganisms().contains(wolf));
    }


    @Test
    void testAddDuplicateOrganism() {
        Wolf wolf = new Wolf();
        location.addOrganism(wolf);
        int initialSize = location.getOrganisms().size();
        location.addOrganism(wolf);
        assertEquals(initialSize, location.getOrganisms().size());
    }

    @Test
    void testRemoveNonExistentOrganism() {
        Wolf wolf = new Wolf();
        int initialSize = location.getOrganisms().size();
        location.removeOrganism(wolf);
        assertEquals(initialSize, location.getOrganisms().size());
    }
}