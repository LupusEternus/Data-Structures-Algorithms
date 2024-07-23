package algorithms;

import dataStructureImplementations.Graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DepthFirst {

    //for an acyclic
    public static void depthFirstTraversal(Graph graph, Character source){
        Stack<Character> stack = new Stack<>();
        stack.push(source);

        while(!stack.empty()){
            char current = stack.pop();
            System.out.println(current);
            for(Character c : graph.getVertices().get(current)){
                stack.push(c);
            }

        }
    }
    //for an acyclic
    public static boolean depthFirstHasPath(Graph graph, Character source, Character destination){
        Stack<Character> stack = new Stack<>();
        stack.push(source);

        while(!stack.empty()){
            char current = stack.pop();
            if(current == destination){
                return true;
            }
            for(Character c : graph.getVertices().get(current)){
                stack.push(c);
            }

        }
        return false;
    }
    //for an acyclic
    public static void depthFirstPrintRecursive(Graph graph,Character source){
        System.out.println(source);
        for(Character c: graph.getVertices().get(source)){
            depthFirstPrintRecursive(graph,c);
        }

    }

    //for a cyclic
    public static boolean depthFirstHasPathCyclic(Graph graph, Character source, Character destination){
        Stack<Character> stack = new Stack<>();
        stack.push(source);
        Set<Character> visited = new HashSet<>();

        while(!stack.empty()){
            char current = stack.pop();
            visited.add(current);
            if(current == destination){
                return true;
            }
            for(Character c : graph.getVertices().get(current)){
                if(!visited.contains(c)) {
                    stack.push(c);
                }
            }

        }
        return false;
    }


}
