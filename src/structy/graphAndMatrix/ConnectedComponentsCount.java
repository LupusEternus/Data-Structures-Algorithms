package structy.graphAndMatrix;

import java.util.*;

/*
problem:
Write a method, connectedComponentsCount, that takes in the adjacency list of an undirected graph.
The method should return the number of connected components within the graph.
https://structy.net/problems/connected-components-count
solution:
using BreadthSearchFirst algorithm;
*/


class ConnectedComponentsCount {
    public static int connectedComponentsCount(Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        int counter = 0;
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            Stack<Integer> stack = new Stack<>();
            if (!visited.contains(entry.getKey())) {
                stack.push(entry.getKey());
                while (!stack.empty()) {
                    Integer current = stack.pop();
                    visited.add(current);
                    for (Integer i : graph.get(current)) {
                        if (!visited.contains(i)) {
                            stack.push(i);
                        }
                    }
                }
                counter++;
            }
        }
        return counter;
    }
}

