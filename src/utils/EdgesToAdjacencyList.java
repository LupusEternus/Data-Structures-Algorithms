package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EdgesToAdjacencyList {

    public static Map<String,List<String>> convertEdgesToNodes(List<List<String>> edges){

        Map<String,List<String>> converted = new HashMap<>();


        for(List<String> edge : edges){
            String node1 = edge.get(0);
            String node2 = edge.get(1);


            converted.putIfAbsent(node1,new ArrayList<>());
            converted.get(node1).add(node2);
            converted.putIfAbsent(node2,new ArrayList<>());
            converted.get(node2).add(node1);

        }

        return converted;
    }



    public static void main(String[] args) {

        List<List<String>> edges = List.of(
                List.of("w", "x"),
                List.of("x", "y"),
                List.of("z", "y"),
                List.of("z", "v"),
                List.of("w", "v")
        );
        Map<String,List<String>> graph = convertEdgesToNodes(edges);
        for(Map.Entry<String,List<String>> entry : graph.entrySet()){
            System.out.print( entry.getKey() + " : ");
            for (String s : entry.getValue()){
                System.out.print( s + "-");
            }
            System.out.println();
        }
    }


}
