# Island Simulation

A discrete-time, grid-based ecosystem simulation of an isolated island. This Java-based application models the life cycles and interactions of various animal and plant species. Each organism on the island follows a set of rules for actions like moving, eating, reproducing, and dying, creating a dynamic and evolving virtual world.

## Core Concepts

-   **Island Grid**: The world is a 2D grid where each cell represents a distinct location.
-   **Organisms**: The simulation is populated with different types of organisms, including predators, herbivores, and plants.
-   **Life Cycle**: The simulation proceeds in discrete time steps, or "cycles". In each cycle, every organism gets a chance to perform actions based on its internal state and its environment.
-   **Interactions**: Organisms can interact with each other. For example, predators hunt herbivores, and herbivores consume plants.

## Code Structure

The project is organized into several classes that model the simulation's components:

-   **`Simulation`**: The main class that drives the simulation. It contains the game loop and manages the simulation state.
-   **`Island`**: Represents the island grid and contains a collection of `Location` objects.
-   **`Location`**: Represents a single cell on the island and holds the organisms present in that cell.
-   **`Organism`**: An abstract base class for all living things in the simulation.
-   **`Animal`** and **`Plant`**: Abstract subclasses of `Organism` that represent animals and plants, respectively.
-   **`Predator`** and **`Herbivore`**: Abstract subclasses of `Animal` for meat-eating and plant-eating animals.
-   **Concrete Animal Classes** (e.g., `Wolf`, `Horse`, `Rabbit`): Each class extends `Predator` or `Herbivore` and defines the specific behaviors and attributes for that animal.

## Testing

The project includes a suite of unit and functional tests to ensure the correctness of the simulation logic.

-   **`AnimalTest`**: Tests the basic functionalities of animal behavior.
-   **`IslandTest`**: Tests the island grid, including organism placement and movement.
-   **`LocationTest`**: Tests the logic for adding and removing organisms from a location.
-   **`SimulationFunctionalTest`**: Contains higher-level tests that simulate scenarios like predator-prey interactions.

### Test Results

All tests in the suite are currently passing.

```
[INFO] Results:
[INFO] 
[INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0
```

## Organism Properties

The table below outlines the specific attributes for each type of animal in the simulation.

| Animal      | Weight (kg) | Max per Cell | Speed (cells/turn) | Food for Satiation (kg) |
|-------------|-------------|--------------|--------------------|-------------------------|
| Wolf        | 50.0        | 30           | 3.0                | 8.0                     |
| Boa         | 15.0        | 30           | 1.0                | 3.0                     |
| Fox         | 8.0         | 30           | 2.0                | 2.0                     |
| Bear        | 500.0       | 5            | 2.0                | 80.0                    |
| Eagle       | 6.0         | 20           | 3.0                | 1.0                     |
| Horse       | 400.0       | 20           | 4.0                | 60.0                    |
| Deer        | 300.0       | 20           | 4.0                | 50.0                    |
| Rabbit      | 2.0         | 150          | 2.0                | 0.45                    |
| Mouse       | 0.05        | 500          | 1.0                | 0.01                    |
| Goat        | 60.0        | 140          | 3.0                | 10.0                    |
| Sheep       | 70.0        | 140          | 3.0                | 15.0                    |
| Boar        | 400.0       | 50           | 2.0                | 50.0                    |
| Buffalo     | 700.0       | 10           | 3.0                | 100.0                   |
| Duck        | 1.0         | 200          | 4.0                | 0.15                    |
| Caterpillar | 0.01        | 1000         | 0.0                | 0.0                     |

Plants (Grass) have a weight of 1 kg and a maximum of 200 units per cell.

## Food Web

The following table shows the probability (in percent) of one animal successfully eating another. The rows represent the predator, and the columns represent the potential prey.

| Predator | Wolf | Boa | Fox | Bear | Eagle | Horse | Deer | Rabbit | Mouse | Goat | Sheep | Boar | Buffalo | Duck | Caterpillar | Plants |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| **Wolf** | - | 0 | 0 | 0 | 0 | 10 | 15 | 60 | 80 | 60 | 70 | 15 | 10 | 40 | 0 | 0 |
| **Boa** | 0 | - | 15 | 0 | 0 | 0 | 0 | 20 | 40 | 0 | 0 | 0 | 0 | 10 | 0 | 0 |
| **Fox** | 0 | 0 | - | 0 | 0 | 0 | 0 | 70 | 90 | 0 | 0 | 0 | 0 | 60 | 40 | 0 |
| **Bear** | 0 | 80 | 0 | - | 0 | 40 | 80 | 80 | 90 | 70 | 70 | 50 | 20 | 10 | 0 | 0 |
| **Eagle** | 0 | 0 | 10 | 0 | - | 0 | 0 | 90 | 90 | 0 | 0 | 0 | 0 | 80 | 0 | 0 |
| **Horse** | 0 | 0 | 0 | 0 | 0 | - | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 100 |
| **Deer** | 0 | 0 | 0 | 0 | 0 | 0 | - | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 100 |
| **Rabbit** | 0 | 0 | 0 | 0 | 0 | 0 | 0 | - | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 100 |
| **Mouse** | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | - | 0 | 0 | 0 | 0 | 0 | 90 | 100 |
| **Goat** | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | - | 0 | 0 | 0 | 0 | 0 | 100 |
| **Sheep** | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | - | 0 | 0 | 0 | 0 | 100 |
| **Boar** | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 50 | 0 | 0 | - | 0 | 0 | 90 | 100 |
| **Buffalo** | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | - | 0 | 0 | 100 |
| **Duck** | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | - | 90 | 100 |
| **Caterpillar**| 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | - | 100 |

## How to Run

To run the simulation, compile the Java source code and execute the `main` method in the `com.example.demo.Simulation` class.

```bash
# Compile the code (requires Maven)
mvn clean install

# Run the simulation
java -cp target/demo-0.0.1-SNAPSHOT.jar com.example.demo.Simulation
```

This will start the simulation in the console, printing the current cycle number at each step.