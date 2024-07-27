package dataStructureImplementations.graph;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph_Generic<T> {

    private Map<T,LinkedList<T>> vertices;

    public Graph_Generic() {
        this.vertices = new HashMap<>();
    }

    public void addVertex(T vertex){
        vertices.putIfAbsent(vertex,new LinkedList<>());
    }
    public void addEdgeDirectional(T from, T to){
        vertices.putIfAbsent(from,new LinkedList<>());
        vertices.putIfAbsent(to,new LinkedList<>());
        vertices.get(from).add(to);
    }
    public void addEdgeBidirectional(T from, T to){
        vertices.putIfAbsent(from,new LinkedList<>());
        vertices.putIfAbsent(to,new LinkedList<>());
        vertices.get(from).add(to);
        vertices.get(to).add(from);
    }
    public void printGraph(){
        for(Map.Entry<T,LinkedList<T>> entry : vertices.entrySet()){
            System.out.print("Vertex : " + entry.getKey());
                for(T c : entry.getValue()){
                    System.out.print(" - > " + c);
                }
            System.out.println();
        }
    }

    public Map<T, LinkedList<T>> getVertices() {
        return vertices;
    }
}

