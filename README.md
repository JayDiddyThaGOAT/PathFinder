## Pathfinder

This is an application programmed in Java using the Swing GUI tools. It can find the shortest path between two spaces and has the option to generate mazes by adding walls manually or automically

## Installation
1. Download the ZIP file or clone the git repository
2. Click on the Pathfinder.exe or Jalen's_Pathfinder.jar (if you have Java 12 installed in your system environment variables)

## How to Use
* Left Click on a button in the grid to pick a start point
* Left Click on another button in the grid to pick an endpoint and start the pathfinder
* Right Click on a button to add a wall

* Check the **Include Diagonals** box to add diagonals in the pathfinder
* Check the **Generate Maze** box to generate a random maze

* Drag the **Grid Size** slider to the left to make it smaller or to the right to make it bigger
* Drag the **Delay (in milliseconds)** slider to the left to speed up the pathfinder or to the right to slow down tha pathfinder

## Algorithms
* Uses A* algorithm to calculate the shortest path
* Uses Recursive algorithm to generate a random maze