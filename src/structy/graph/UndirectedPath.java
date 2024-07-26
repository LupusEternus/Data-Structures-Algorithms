package structy.graph;

import java.util.*;

import static utils.EdgesToAdjacencyList.convertEdgesToNodes;


/*
problem:
Write a method, undirectedPath, that takes in a list of edges for an undirected graph and two nodes (nodeA, nodeB).
The method should return a boolean indicating whether or not there exists a path between nodeA and nodeB.
https://structy.net/problems/undirected-path
 */

public class UndirectedPath {

    public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
        Map<String,List<String>> nodes = convertEdgesToNodes(edges);

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(nodeA);
        while(!queue.isEmpty()){
            String currentNode = queue.poll();
            if(currentNode.equals(nodeB)) return true;
            visited.add(currentNode);
            for(String s : nodes.get(currentNode)){
                if(!visited.contains(s)){
                    queue.add(s);
                }
            }
        }
        return false;
    }
}
