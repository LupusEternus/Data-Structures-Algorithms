package structy.graphAndMatrix;



import java.util.*;


/*
problem:
Write a method, islandCount, that takes in a grid containing Ws and Ls. W represents water and L represents land.
The method should return the number of islands on the grid. An island is a vertically or horizontally connected region of land.
https://structy.net/problems/island-count
solution:
using DepthSearchFirst algorithm;
*/

public class IslandCount {

    public static int islandCount(List<List<String>> grid) {
        Set<String> visited = new HashSet<>();
        int islands = 0;
        for(int i = 0; i < grid.size(); i++){
            for(int j = 0 ; j < grid.get(0).size(); j++){
                if(explore(grid,i,j,visited)){
                    islands += 1;
                }
            }
        }
        return islands;
    }
    public static boolean explore(List<List<String>> grid,int i, int j, Set<String> visited){
        boolean row = (0 <= i) && (i < grid.size());
        boolean col = (0 <= j ) && (j < grid.get(0).size());

        if(!row || !col) return false;

        String pos = i + "," + j;

        if(visited.contains(pos)) return false;
        visited.add(pos);

        if(grid.get(i).get(j).equals("W")) return false;

        explore(grid,i + 1,j, visited);
        explore(grid,i - 1,j, visited);
        explore(grid,i,j + 1, visited);
        explore(grid,i,j - 1, visited);

        return true;

    }

}
