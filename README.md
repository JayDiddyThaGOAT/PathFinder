## Installation
1. Download the ZIP file or clone the git repository
2. Click on the **Pathfinder.exe**

## How to Use
* Left Click on a button in the grid to pick a start point\
![](https://thumbs.gfycat.com/AmusedAdeptLark-size_restricted.gif)

* Left Click on another button in the grid to pick an endpoint and start the pathfinder\
![](https://thumbs.gfycat.com/FakeAnotherBoar-size_restricted.gif)

* Right Click on a button to add a wall\
![](https://thumbs.gfycat.com/PertinentExcitableHadrosaurus-size_restricted.gif)

* Drag the **Grid Size** slider to the left to make it smaller or to the right to make it bigger\
![](https://thumbs.gfycat.com/CrispGrayIrrawaddydolphin-size_restricted.gif)

* Drag the **Delay (in milliseconds)** slider to the left to speed up the pathfinder or to the right to slow down tha pathfinder\
![](https://thumbs.gfycat.com/ElegantMeagerGypsymoth-size_restricted.gif)

* Check the **Include Diagonals** box to add diagonals in the pathfinder\
![](https://thumbs.gfycat.com/ScarceEnormousDanishswedishfarmdog-size_restricted.gif)

* Check the **Generate Maze** box to generate a random maze\
![](https://thumbs.gfycat.com/EnragedFondGuineafowl-size_restricted.gif)

## Algorithms
* **A\* algorithm** to calculate the shortest path
  - Find the cell closest to the end point
  - Add surrounding nodes of that cell for evaluation
  - Construct the path that was found
  - Show Error If No Path Was Found
  
* **Recursive algorithm** to generate a random maze
  - Begin with a empty grid
  - Set the wall sizes to the width and height of our grid
  - Split the maze into fourths with a horizontal wall & vertical wall
  - Add two passages through each side of the horizontal wall & vertical wall
  - Recursively divide each of the four sides of the maze until the width or height of the walls are 2 cells
