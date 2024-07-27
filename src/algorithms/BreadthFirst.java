package algorithms;

import dataStructureImplementations.graph.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirst {

    //for an acyclic
    public static void breadthFirstPrint(Graph graph, Character source){
        Queue<Character> queue = new LinkedList<>();
        queue.add(source);
        while(!queue.isEmpty()){
            Character current = queue.poll();
            System.out.println(current);
            for(Character c : graph.getVertices().get(current)){
                queue.add(c);
            }
        }
    }
    //for an acyclic
    public static boolean breadthFirstHasPath(Graph graph, Character source, Character destination) {
        Queue<Character> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            Character current = queue.poll();
            if (current == destination) return true;
            for (Character c : graph.getVertices().get(current)) {
                queue.add(c);
            }
        }
        return false;
    }
    //for a cyclic
    public static boolean breadthFirstHasPathCyclic(Graph graph, Character source, Character destination) {
        Queue<Character> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            Character current = queue.poll();
            visited.add(current);
            if (current == destination) return true;
            for (Character c : graph.getVertices().get(current)) {
                if(!visited.contains(c)) {
                    queue.add(c);
                }
            }
        }
        return false;
    }

}
