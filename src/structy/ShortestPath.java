package structy;


import java.util.*;

import static structy.EdgesToAdjacencyList.convertToNodes;

/*
problem:
Write a method, shortestPath, that takes in a list of edges for an undirected graph and two nodes (nodeA, nodeB).
The method should return the length of the shortest path between A and B. Consider the length as the number of
edges in the path, not the number of nodes. If there is no path between A and B, then return -1. You can assume
that A and B exist as nodes in the graph.
https://structy.net/problems/shortest-path
solution:
using BreadthSearchFirst algorithm;
*/

public class ShortestPath {
    public static int shortestPath(List<List<String>> edges, String nodeA, String nodeB) {
        Map<String, List<String>> graph = convertToNodes(edges);

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distances = new HashMap<>();
        Set<String> visited = new HashSet<>();

        queue.add(nodeA);
        distances.put(nodeA, 0);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            Integer currentDistance = distances.get(current);
            if (current.equals(nodeB)) return currentDistance;
            for (String s : graph.get(current)) {
                if (!visited.contains(s)) {
                    queue.add(s);
                    distances.put(s, currentDistance + 1);
                    visited.add(s);
                }
            }
        }
        return -1;
    }
}
