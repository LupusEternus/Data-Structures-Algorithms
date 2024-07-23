package algorithms;

import dataStructureImplementations.Graph;

import java.util.LinkedList;
import java.util.Queue;

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

}
