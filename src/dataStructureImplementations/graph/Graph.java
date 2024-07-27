package dataStructureImplementations.graph;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {

    private Map<Character,LinkedList<Character>> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public void addVertex(Character vertex){
        vertices.putIfAbsent(vertex,new LinkedList<>());
    }
    public void addEdgeDirectional(Character from,Character  to){
        vertices.putIfAbsent(from,new LinkedList<>());
        vertices.putIfAbsent(to,new LinkedList<>());
        vertices.get(from).add(to);
    }
    public void addEdgeBidirectional(Character from, Character to){
        vertices.putIfAbsent(from,new LinkedList<>());
        vertices.putIfAbsent(to,new LinkedList<>());
        vertices.get(from).add(to);
        vertices.get(to).add(from);
    }
    public void printGraph(){
        for(Map.Entry<Character,LinkedList<Character>> entry : vertices.entrySet()){
            System.out.print("Vertex : " + entry.getKey());
                for(Character c : entry.getValue()){
                    System.out.print(" - > " + c);
                }
            System.out.println();
        }
    }

    public Map<Character, LinkedList<Character>> getVertices() {
        return vertices;
    }
}

