package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testAnimalCreation() {
        Wolf wolf = new Wolf();
        assertEquals(50.0, wolf.getWeight());
        assertEquals(30, wolf.getMaxCountOnLocation());
        assertEquals(3, wolf.getSpeed());
        assertEquals(8.0, wolf.getFullness());
    }

    @Test
    void testAnimalCreationBear() {
        Bear bear = new Bear();
        assertEquals(500.0, bear.getWeight());
        assertEquals(5, bear.getMaxCountOnLocation());
        assertEquals(2, bear.getSpeed());
        assertEquals(80.0, bear.getFullness());
    }
}