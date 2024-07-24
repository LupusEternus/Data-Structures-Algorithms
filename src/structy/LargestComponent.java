package structy;

import java.util.*;

/*
problem:
Write a method, largestComponent, that takes in the adjacency list of an undirected graph.
The method should return the size of the largest connected component in the graph.
https://structy.net/problems/largest-component
solution:
using DepthSearchFirst algorithm;
*/

class LargestComponent {
    public static int largestComponent(Map<Integer, List<Integer>> graph) {
        int largest = 0;
        Set<Integer> visited = new HashSet<>();
        for (Map.Entry<Integer, List<Integer>> pair : graph.entrySet()) {
            Stack<Integer> stack = new Stack<>();
            if (!visited.contains(pair.getKey())) {
                int temp = 0;
                stack.push(pair.getKey());
                visited.add(pair.getKey());
                while (!stack.empty()) {
                    Integer current = stack.pop();
                    temp++;
                    for (Integer i : graph.get(current)) {
                        if (!visited.contains(i)) {
                            stack.push(i);
                            visited.add(i);
                        }
                    }
                }
                if (temp > largest) {
                    largest = temp;
                }
            }
        }
        return largest;
    }
}


