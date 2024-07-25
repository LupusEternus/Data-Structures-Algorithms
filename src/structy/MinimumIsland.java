package structy;


import java.util.*;
/*
problem:
Write a method, minimumIsland, that takes in a grid containing Ws and Ls. W represents water and L represents land.
The method should return the size of the smallest island. An island is a vertically or horizontally connected region of land.
You may assume that the grid contains at least one island.
https://structy.net/problems/minimum-island
solution:
using DepthSearchFirst algorithm;
*/

public class MinimumIsland {
    public static int minimumIsland(List<List<String>> grid) {
        int minimum = Integer.MAX_VALUE;
        int temp = 0;
        Set<String> visited = new HashSet<>();
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).size(); j++) {
                temp = explore(grid, i, j, visited);
                if (temp > 0 && temp < minimum) {
                    minimum = temp;
                }
                temp = 0;
            }
        }
        return minimum;
    }

    public static int explore(List<List<String>> grid, int i, int j, Set<String> visited) {
        boolean row = (i >= 0) && (i < grid.size());
        boolean col = (j >= 0) && (j < grid.get(0).size());

        if (!row || !col) return 0;

        String pos = i + "," + j;
        if (visited.contains(pos)) return 0;
        visited.add(pos);

        if (grid.get(i).get(j).equals("W")) return 0;

        int size = 1;
        size += explore(grid, i + 1, j, visited);
        size += explore(grid, i - 1, j, visited);
        size += explore(grid, i, j + 1, visited);
        size += explore(grid, i, j - 1, visited);

        return size;
    }
}
